package com.github.TylerWhitmore.cs3230.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.ArrayList;
import org.apache.commons.lang3.ArrayUtils; //lang3 from https://www.youtube.com/watch?v=iHbiY1i4ivc
import src.com.github.TylerWhitmore.cs3230.Calculations;

public class Gui {
    private JTextField submitField;
    private JButton submitButton;
    private JComboBox operationsBox;
    private JTextArea solveArea;
    private JLabel currentNumLabel;
    private JPanel rootPanel;
    private JLabel numLabel;

    Double[] nums;

    public Gui(){
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // convert text from submitField and validate
                // take validated numbers and put them in currentNumLabel
                nums = getNewNumbers();
                String output = Arrays.deepToString(nums);
                currentNumLabel.setText(output);
            }
        });

        operationsBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JComboBox tinyBox = (JComboBox) e.getSource();
                Object selected = tinyBox.getSelectedItem();
                String operation = selected.toString();
                double[] d = ArrayUtils.toPrimitive(nums);
                switch(operation){
                    case "Min":
                        solveArea.setText(String.valueOf(Calculations.min(d)));
                        break;
                    case "Max":
                        solveArea.setText(String.valueOf(Calculations.max(d)));
                        break;
                    case "Evens":
                        String outputEvens = "";
                        ArrayList<String> listEvens = new ArrayList<>();
                        for(double curr : Calculations.evens(d)){ //for every double in the return of evens
                            listEvens.add(String.valueOf(curr));
                        }
                        for(String s : listEvens){
                            outputEvens += s + ' ';
                        }
                        solveArea.setText(outputEvens);
                        break;
                    case "Odds":
                        String outputOdds = "";
                        ArrayList<String> listOdds = new ArrayList<>();
                        for(double curr : Calculations.odds(d)){ //for every double in the return of evens
                            listOdds.add(String.valueOf(curr));
                        }
                        for(String s : listOdds){
                            outputOdds += s + ' ';
                        }
                        solveArea.setText(outputOdds);
                        break;
                    case "Sum":
                        solveArea.setText(String.valueOf(Calculations.sum(d)));
                        break;
                    case "Std Deviation":
                        solveArea.setText(String.valueOf(Calculations.std(d)));
                        break;
                    case "Five Number Summary":
                        double[] fiveNum = new double[5];
                        ArrayList<String> stringFive = new ArrayList<String>();
                        String outputFive = "";
                        fiveNum = Calculations.fiveNum(d);
                        for(double x : fiveNum){
                            stringFive.add(String.valueOf(x));
                        }
                        for(String ss : stringFive){
                            outputFive += ss + ' ';
                        }
                        solveArea.setText(outputFive);
                        break;
                    default:
                        solveArea.setText(operation);
                        //solveArea.setText("Not a valid operation");
                        break;
                }
            }
        });
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("CS3230 Project");
        frame.setContentPane(new Gui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private Double[] getNewNumbers(){
        String[] userInput = submitField.getText().split("\\s+");
        Double[] doubles = new Double[userInput.length];
        for(int i = 0; i < userInput.length; i++){
            try{
                doubles[i] = Double.parseDouble(userInput[i]);
            }
            catch (NumberFormatException ex){
                String message = ("Invalid double: " + userInput[i]);
                currentNumLabel.setText(message);
            }
        }
        return doubles;
    }

}
