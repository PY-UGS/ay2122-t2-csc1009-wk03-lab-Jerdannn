package CSC1009_Lab.Lab_3;

public class Loan {
    // Attributes
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    // Operations
    // Default Constructor
    public Loan() {
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
        // Stores the current datetime
        this.loanDate = new java.util.Date();
    }

    public Loan(double ir, int years, double loan) {
        this.annualInterestRate = ir;
        this.numberOfYears = years;
        this.loanAmount = loan;
        this.loanDate = new java.util.Date();
    }

    // Getters
    public double getAnnualInterestRate() { return this.annualInterestRate; }

    public int getNumberOfYears() { return this.numberOfYears; }

    public double getLoanAmount() { return this.loanAmount; }

    public java.util.Date getLoanDate() { return this.loanDate; }

    // Setters
    public void setAnnualInterestRate(double ir) { this.annualInterestRate = ir; }

    public void setNumberOfYears(int years) { this.numberOfYears = years; }

    public void setLoanAmount(double loan) { this.loanAmount = loan; }

    // Misc.
    // Returns the monthly payment for this loan
    public double getMonthlyPayment() {
        // Get the monthly interest rate
        double monthlyInterestRate = getAnnualInterestRate() / 1200;

        double monthlyPayment = (getLoanAmount() * monthlyInterestRate) /
        (1 - (1 / Math.pow(1 + monthlyInterestRate, getNumberOfYears() * 12)));
        return monthlyPayment;
    }

    // Returns the total payment for this loan
    public double getTotalPayment() {
        double totalPayment = getMonthlyPayment() * this.numberOfYears * 12;
        return totalPayment;
    }
}
