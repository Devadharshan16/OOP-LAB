
class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
    public double getBalance() {
        return balance;
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("John");
        acc.deposit(1000);
        acc.withdraw(300);
        
        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Current Balance: $" + acc.getBalance());
    }
}
