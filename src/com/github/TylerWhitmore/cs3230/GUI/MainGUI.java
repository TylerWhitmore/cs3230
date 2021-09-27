package com.github.TylerWhitmore.cs3230.GUI;

import javax.swing.*;

public class MainGUI {

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        MainGUI gui = new MainGUI();
        gui.getTabbedPane1().addTab("Ticker", new SearchGUI().getRootPanel());
        frame.setContentPane(gui.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();frame.setVisible(true);
    }
}
