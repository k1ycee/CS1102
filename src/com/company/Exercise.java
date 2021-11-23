package com.company;

public class Exercise {
    public static void main(String [] args) {
        forExample();
    }
    public static void forExample(){
        int years;
        years = 0;
        double interest, principal, rate;
        principal = 1200;
        rate = 1.5;
        for ( years = 0; years < 5; years++ ) {
            interest = principal * rate;
            principal += interest;
            System.out.println(principal);
        }
        do{
            interest = principal * rate;
            principal += interest;
            System.out.println(principal);
            years++;
        } while(years < 5);

        while (years < 5){
            interest = principal * rate;
            principal += interest;
            System.out.println(principal);
            years++;
        }
    }
}
