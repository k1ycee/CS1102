package com.company;
import java.awt.*;
import javax.swing.*;

public abstract class Question {

    static int nQuestions = 0;
    static int nCorrect = 0;

    QuestionDialog question;
    String correctAnswer;

    public Question(String question){
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel(" "+  question+" " ,JLabel.CENTER));
    }

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

    String ask() {
        nQuestions++;
        question.setVisible(true);
        return  question.answer;
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
}
