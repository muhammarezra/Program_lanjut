package Gui;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame JFrame = new JFrame("Form Biodata");
        JFrame.setContentPane(new FormBiodata().getrootPanel());
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JFrame.setLocationRelativeTo(null);
        JFrame.setSize(500,400);
        JFrame.setVisible(true);
    }
}

