
public class LCMCalculator {
    public static void main(String[] args) {
        int a = 12; int b = 18;int lcm;

        int gcd = a;
        int tempB = b;
        while (tempB != 0) {
            int temp = tempB;
            tempB = gcd % tempB;
            gcd = temp;
        }

        lcm = (a * b) / gcd;
        System.out.println("LCM is " + lcm);
    }
}
