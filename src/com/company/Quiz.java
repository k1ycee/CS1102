package com.company;

public class Quiz {


    public static void main(String[] args){
        MultipleChoiceQuestion question = new MultipleChoiceQuestion("What is the capital of Pakistan?", "Islamabad", "Abuja", "Kuala Lumpur" ,"Moscow" ," Ulan Bator", "A");
        question.check();
        MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("Who invented the telephone?", "Alphonso Davies", "Taylor Swift", "Graham Bell" ,"Tsuchikage Sama" ,"Karl Marx", "C");
        question2.check();
        MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Who is considered the father of computers?", "Hiruzen Sarutobi", "Charles Babbage", "Neji Hyuga" ,"Captain America" ,"Yoindaime Sama", "B");
        question3.check();
        MultipleChoiceQuestion question4 = new MultipleChoiceQuestion("Which is an African Country?", "India", "Maldives", "Mauritania" ,"Fiji" ,"Albania", "C");
        question4.check();
        MultipleChoiceQuestion question5 = new MultipleChoiceQuestion("Which is a south American Country", "Mongolia", "Mauritius", "Sychelles" ,"Brazil" ,"Yoindaime Sama", "D");
        question5.check();
        MultipleChoiceQuestion.showResults();
    }
}
