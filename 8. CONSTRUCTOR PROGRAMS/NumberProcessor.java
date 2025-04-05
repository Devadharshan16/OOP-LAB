public class NumberProcessor {
    private int number;
    private String text;

    public NumberProcessor() {
        this.number = 0;
        this.text = "Default";
        System.out.println("Default constructor called.");
    }

    public NumberProcessor(int number) {
        this.number = number;
        this.text = "Number Only";
        System.out.println("Constructor with int parameter called.");
        checkEvenOrOdd();
    }

    public NumberProcessor(int number, String text) {
        this.number = number;
        this.text = text;
        System.out.println("Constructor with int and String parameters called.");
        printTextMultipleTimes();
    }

    private void checkEvenOrOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
    }

    private void printTextMultipleTimes() {
        System.out.println("Printing text " + number + " times:");
        for (int i = 0; i < number; i++) {
            System.out.println((i + 1) + ": " + text);
        }
    }

    public static void main(String[] args) {
        NumberProcessor obj1 = new NumberProcessor();
        NumberProcessor obj2 = new NumberProcessor(7);
        NumberProcessor obj3 = new NumberProcessor(3, "Hello");
    }
}
