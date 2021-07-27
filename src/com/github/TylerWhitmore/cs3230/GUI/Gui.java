package src.com.github.TylerWhitmore.cs3230.GUI;

import javax.swing.*;

public class Gui {
    private JTextField submitField;
    private JButton submitButton;
    private JComboBox operationsBox;
    private JButton solveButton;
    private JTextArea solveArea;

    public static void main(String[] args){
        JFrame frame = new JFrame("CS3230 Project");
        frame.setContentPane(new Gui().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
