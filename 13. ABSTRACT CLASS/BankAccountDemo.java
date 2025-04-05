abstract class BankAccount {
    String holderName;
    double balance;

    BankAccount(String name, double balance) {
        this.holderName = name;
        this.balance = balance;
    }

    abstract boolean withdraw(double amount);
    abstract void deposit(double amount);

    void printBalance() {
        System.out.println(holderName + " Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    boolean withdraw(double amount) {
        if (amount <= balance - 100) {
            balance -= amount;
            System.out.println("Withdrawal Successful: $" + amount);
            return true;
        }
        System.out.println("Insufficient balance.");
        return false;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        }
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount acc = new SavingsAccount("Sneha", 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.withdraw(1500);
        acc.printBalance();
    }
}