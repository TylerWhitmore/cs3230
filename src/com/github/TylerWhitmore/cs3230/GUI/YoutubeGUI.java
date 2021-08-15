package com.github.TylerWhitmore.cs3230.GUI;


import com.github.TylerWhitmore.cs3230.GUI.Models.Video;
import com.google.gson.JsonObject;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class YoutubeGUI {
    private JPanel rootPanel;
    private JTextField searchField;
    private JButton searchBtn;
    private JPanel searchPanel;
    private JLabel titleLabel;
    private JTextArea descArea;
    private String userInput;
    private String baseUrl = "https://www.youtube.com/watch?v=";

    public YoutubeGUI() {
        searchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(searchField.getText().isEmpty()){
                    userInput = "RossBoomsocks";
                }
                else {
                    userInput = searchField.getText();
                }
                JsonObject trial = HttpClient.getResult(userInput);
                JsonObject item = trial.getAsJsonArray("items").get(0).getAsJsonObject();
                Video test = Video.deserialize(item);
                titleLabel.setText(test.getVideoChannel() + " - " + test.getVideoTitle());
                descArea.setText((test.getVideoDesc()));

                SimpleSwingBrowser browser = new SimpleSwingBrowser();
                browser.setVisible(true);
                browser.loadURL(baseUrl + test.getVideoId());
            }
        });
    }

    public JPanel getRootPanel() {
        return rootPanel;
    }

    public static void main(String[] args) throws IOException {
        JFrame frame = new JFrame("CS3230 Project");
        frame.setContentPane(new YoutubeGUI().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(620,440);
        frame.pack();
        frame.setVisible(true);
    }

}