package com.company;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

public class SuperPower {
    public static void main(String[] args) {
        String power = JOptionPane.showInputDialog("What is your super power?");
        power = power.toUpperCase();
        JOptionPane.showMessageDialog(null,power+" TO THE RESCUE!");
    }
}
