
public class EvenOddSum {
    public static void main(String[] args) {
        int evenSum = 0; int oddSum = 0; int limit = 10;

        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            } else {
                oddSum += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to " + limit + ": " + evenSum);
        System.out.println("Sum of odd numbers from 1 to " + limit + ": " + oddSum);
    }
}
