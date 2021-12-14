package com.company;
import javax.swing.JOptionPane;

public class TrueFalseQuestion extends Question{


    public  TrueFalseQuestion (String question, String answer){
        this.question = "TRUE or FALSE: "+ question;
        this.correctAnswer = answer.toUpperCase();
    }
    @Override
    String ask() {

        while (true){
        String answer = JOptionPane.showInputDialog(this.question);


        answer = answer.toUpperCase();

        boolean trueString = answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES");
        boolean falseString = answer.equals("FALSE") || answer.equals("NO") || answer.equals("F") || answer.equals("N");

        if (trueString) {
            nQuestions++;
            return "TRUE";
        }else if(falseString){
            nQuestions++;
            return "FALSE";
        }

        else {
            JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE\n" + "or FALSE.");
        }

        }

    }
}
