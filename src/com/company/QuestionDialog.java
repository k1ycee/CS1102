package com.company;
import java.awt.event.*;
import javax.swing.*;

public class QuestionDialog extends JDialog implements ActionListener {
    String answer;
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        answer = actionEvent.getActionCommand();
        dispose();
    }
}
