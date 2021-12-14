package com.company;

import javax.swing.*;

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;


    void check(){
        String answer = ask();

        if(answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect.\n" +
                    "The correct answer is " + correctAnswer);
        }
    }


    static void showResults(){
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of questions " + nQuestions);
    }

    abstract String ask();
}
