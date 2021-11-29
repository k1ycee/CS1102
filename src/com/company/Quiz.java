package com.company;
import javax.swing.JOptionPane;

public class Quiz {

    static int nQuestions = 0;
    static int nCorrect = 0;
    public static void main(String[] args){
        String question1 = "What is the capital of Pakistan?\n";
        question1 += "A. Islamabad \n B. Abuja \n C. Kuala Lumpur \n D. Moscow \n E. Ulan Bator";
        String question2 = "Who invented the telephone?";
        question2 += "\nA. Alphonso Davies \n B. Taylor Swift \n C. Graham Bell \n D. Tsuchikage Sama \n E. Karl Marx";
        String question3 = "Who is considered the father of computers";
        question3 += "\nA. Hiruzen Sarutobi \n B. Charles Babbage \n C. Neji Hyuga \n D. Captain America \n E. Yoindaime Sama";
        check(question1, "A");
        check(question2, "C");
        check(question3, "B");
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of questions " + nQuestions);
    }
    static String ask(String question){
        while (true){
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();
            if(answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E")){
                nQuestions++;
                return answer;
            } else {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A, B, C, D, or E.");
            }
        }

    }
    static void check(String question, String correctAnswer){
        String answer = ask(question);

        if(answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect++;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect.\n" +
                    "The correct answer is " + correctAnswer);
        }
    }
}
