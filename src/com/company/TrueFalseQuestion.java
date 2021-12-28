package com.company;
import javax.swing.*;

public class TrueFalseQuestion extends Question{


    public  TrueFalseQuestion (String question, String answer){
        super(question);
        this.correctAnswer = answer.toUpperCase();
        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");

        this.question.add(buttons);
        initQuestionDialog();
    }



    void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);
        buttons.add(button);
    }
}
