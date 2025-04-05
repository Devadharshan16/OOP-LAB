public class PlayerConstructorExample {

    private String name;
    private int level;

    public PlayerConstructorExample() {
        this.name = "Default Player";
        this.level = 1;
    }

    public PlayerConstructorExample(String name) {
        this.name = name;
        this.level = 1;
    }

    public PlayerConstructorExample(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public void displayInfo() {
        System.out.println("Player Name: " + name + ", Level: " + level);
    }

    public static void main(String[] args) {
        PlayerConstructorExample player1 = new PlayerConstructorExample();
        PlayerConstructorExample player2 = new PlayerConstructorExample("Alice");
        PlayerConstructorExample player3 = new PlayerConstructorExample("Bob", 5);

        player1.displayInfo();
        player2.displayInfo();
        player3.displayInfo();
    }
}