package com.github.TylerWhitmore.cs3230.GUI;

import javax.swing.*;

public class MainGUI {
    public JPanel getRootPanel() {
        return rootPanel;
    }

    public JTabbedPane getTabbedPane1() {
        return tabbedPane1;
    }

    private JPanel rootPanel;
    private JTabbedPane tabbedPane1;


    public static void main(String[] args) {
        JFrame frame = new JFrame("Main");
        MainGUI gui = new MainGUI();
        gui.getTabbedPane1().addTab("Math", new MathGUI().getRootPanel());
        gui.getTabbedPane1().addTab("Youtube", new YoutubeGUI().getRootPanel());
        frame.setContentPane(gui.rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();frame.setVisible(true);
    }
}
