package Lab_3;

public class Loan {
    //Attributes
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private java.util.Date loanDate;

    //Operations
    //Default constructor
    public Loan() {}

    public Loan(double interest, int years, double loan) {
        this.annualInterestRate = interest;
        this.numberOfYears = years;
        this.loanAmount = loan;
        this.loanDate = new java.util.Date();
    }

    //Get
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public int numberOfYears() {
        return numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public java.util.Date getLoanDate() {
        return this.loanDate;
    }

    //Set
    public void setAnnualInterestRate(double interest) {
        this.annualInterestRate = interest;
    }

    public void setNumberOfYears(int years) {
        this.numberOfYears = years;
    }

    public void setLoanAmount(double loan) {
        this.loanAmount = loan;
    }

    //Misc.
    public double getMonthlyPayment() {
        double top = this.loanAmount * (this.annualInterestRate / 1200);
        double bottom = 1 - (1 / Math.pow(1 + (this.annualInterestRate / 1200), this.numberOfYears * 12));

        return top / bottom;
    }

    public double getTotalPayment() {
        return this.getMonthlyPayment() * this.numberOfYears * 12;
    }
}