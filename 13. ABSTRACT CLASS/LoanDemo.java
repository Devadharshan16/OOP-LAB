abstract class Loan {
    double principal;
    int term; // in years

    Loan(double principal, int term) {
        this.principal = principal;
        this.term = term;
    }

    abstract double calculateInterestRate();
    abstract String loanType();

    void calculateEMI() {
        double rate = calculateInterestRate();
        double monthlyRate = rate / (12 * 100);
        int months = term * 12;
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) / (Math.pow(1 + monthlyRate, months) - 1);
        System.out.println(loanType() + " Loan EMI: " + String.format("%.2f", emi));
    }
}

class HomeLoan extends Loan {
    HomeLoan(double p, int t) {
        super(p, t);
    }

    double calculateInterestRate() {
        return principal > 500000 ? 6.5 : 7.0;
    }

    String loanType() {
        return "Home";
    }
}

class EducationLoan extends Loan {
    EducationLoan(double p, int t) {
        super(p, t);
    }

    double calculateInterestRate() {
        return term > 5 ? 5.5 : 6.0;
    }

    String loanType() {
        return "Education";
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        Loan home = new HomeLoan(600000, 10);
        Loan edu = new EducationLoan(200000, 4);
        home.calculateEMI();
        edu.calculateEMI();
    }
}