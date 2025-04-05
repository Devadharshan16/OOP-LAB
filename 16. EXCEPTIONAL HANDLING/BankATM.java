import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class BankATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000.0;
        boolean retry = true;

        while (retry) {
            try {
                System.out.print("Enter amount to withdraw: ");
                double amount = Double.parseDouble(sc.nextLine());

                if (amount > balance) {
                    throw new InsufficientFundsException("Insufficient balance!");
                }

                balance -= amount;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
                retry = false;

            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            } catch (InsufficientFundsException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}