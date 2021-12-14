package com.company;

public class Quiz {


    public static void main(String[] args){
        Question question = new MultipleChoiceQuestion("What is the capital of Pakistan?", "Islamabad", "Abuja", "Kuala Lumpur" ,"Moscow" ," Ulan Bator", "A");
        question.check();
       Question question2 = new MultipleChoiceQuestion("Who invented the telephone?", "Alphonso Davies", "Taylor Swift", "Graham Bell" ,"Tsuchikage Sama" ,"Karl Marx", "C");
        question2.check();
        Question question3 = new MultipleChoiceQuestion("Who is considered the father of computers?", "Hiruzen Sarutobi", "Charles Babbage", "Neji Hyuga" ,"Captain America" ,"Yoindaime Sama", "B");
        question3.check();
       Question question4 = new MultipleChoiceQuestion("Which is an African Country?", "India", "Maldives", "Mauritania" ,"Fiji" ,"Albania", "C");
        question4.check();
     Question question5 = new MultipleChoiceQuestion("Which is a south American Country", "Mongolia", "Mauritius", "Sychelles" ,"Brazil" ,"Yoindaime Sama", "D");
        question5.check();

        Question trueFalse1 = new TrueFalseQuestion("It's the festive season?", "true");
        trueFalse1.check();
        Question trueFalse2 = new TrueFalseQuestion("Humans are Immortal?", "false");
        trueFalse2.check();
        Question trueFalse3 = new TrueFalseQuestion("Lions are house pets?", "false");
        trueFalse3.check();
        Question trueFalse4 = new TrueFalseQuestion("Humans have the ability to Fly?", "false");
        trueFalse4.check();
        Question trueFalse5 = new TrueFalseQuestion("We are all humans on planet earth?", "true");
        trueFalse5.check();

        Question.showResults();
    }
}
