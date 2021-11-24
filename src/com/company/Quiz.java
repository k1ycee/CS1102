package com.company;
import javax.swing.JOptionPane;

public class Quiz {

    public static void main(String[] args){
        String question = "What is the capital of Pakistan?\n";
        String[] options = {"A", "B", "C", "D", "E"};
        question += "A. Islamabad \n B. Abuja \n C. Kuala Lumpur \n D. Moscow \n E. Ulan Bator";
        while (true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if(answer.equals("A")){
                JOptionPane.showMessageDialog(null, "Correct!");
                break;
            }
            else if(answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
                JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
            }
            else {

                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }
    }
}
