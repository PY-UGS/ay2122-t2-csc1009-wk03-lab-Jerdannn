package Lab_3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double userInterest = userInput.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int userYears = userInput.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double userLoan = userInput.nextDouble();

        //Creating an object from the Loan class
        Loan aLoan = new Loan(userInterest, userYears, userLoan);

        System.out.println("The loan was created on " + aLoan.getLoanDate());
        System.out.printf("The monthly payment is %.2f\n", aLoan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f", aLoan.getTotalPayment());
        //Close the scanner after
        userInput.close();
    }
}