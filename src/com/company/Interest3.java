package com.company;
import java.util.Scanner;

/**
 * This class implements a simple program that will compute the amount of
 * interest that is earned on an investment over a period of 5 years. The
 * initial amount of the investment and the interest rate are input by the
 * user. The value of the investment at the end of each year is output.
 */
public class Interest3 {
    public static void main(String[] args) {
        double principal;
        double rate;
// The value of the investment.
// The annual interest rate.
        /* Get the initial investment and interest rate from the user. */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial investment: ");
        principal = sc.nextDouble();
        System.out.println();
        System.out.println("Enter the annual interest rate.");
        System.out.print("Enter a decimal, not a percentage: ");
        rate = sc.nextDouble();
        System.out.println();
        /* Simulate the investment for 5 years. */
        int years;
// Counts the number of years that have passed.
        years = 0;
        while (years < 5) {
            double interest; // Interest for this year.
            interest = principal * rate;
            principal = principal + interest;
// Add it to principal.
            years = years + 1;
// Count the current year.
            System.out.print("The value of the investment after ");
            System.out.print(years);
            System.out.print(" years is $");
            System.out.printf("%1.2f", principal);
            System.out.println();
        } // end of while loop
    } // end of main()
}
