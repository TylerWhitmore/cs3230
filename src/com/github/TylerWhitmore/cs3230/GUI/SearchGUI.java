package com.github.TylerWhitmore.cs3230.GUI;


import com.github.TylerWhitmore.cs3230.GUI.Models.Ticker;
import com.google.gson.JsonObject;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class SearchGUI {
    private JPanel rootPanel;
    private JTextField searchField;
    private JButton searchBtn;
    private JPanel searchPanel;
    private JTextArea descArea;
    private String userInput;

    public SearchGUI() {
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(searchField.getText().isEmpty()){
                    userInput = "GOOGL";
                }
                else {
                    userInput = searchField.getText();
                }
                JsonObject trial = HttpClient.getResult(userInput);

                //JsonObject item = trial.getAsJsonArray("object").getAsJsonObject();
                //Ticker test = Ticker.deserialize(trial);
                String test = Ticker.deserialize(trial);
                descArea.setText(test);
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("Ticker Project");
        frame.setContentPane(new SearchGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,440);
        frame.pack();
        frame.setVisible(true);
    }

}