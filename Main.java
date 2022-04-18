package CSC1009_Lab.Lab_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creates a scanner object
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double amount = input.nextDouble();

        // Creates a new 'Loan' object
        Loan l = new Loan(interestRate, years, amount);
        System.out.println("The loan was created on " + l.getLoanDate());
        // To print out in a specific format, use 'printf'
        // s -> string, d -> integer, f -> floating, t -> datetime, b -> boolean
        System.out.printf("The monthly payment is %.2f\n", l.getMonthlyPayment());
        System.out.printf("The total payment is %.2f", l.getTotalPayment());

        input.close();
    } 
}
