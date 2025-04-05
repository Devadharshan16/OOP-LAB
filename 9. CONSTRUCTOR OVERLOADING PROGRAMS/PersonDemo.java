class Person {
    String name;
    int age;
    String address;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
        this.address = "Not provided";
    }

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.address = "Not provided";
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Not provided";
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice");
        Person person3 = new Person("Bob", 25);
        Person person4 = new Person("Charlie", 30, "123 Main St");

        System.out.println("Person 1:");
        person1.displayDetails();
        System.out.println("\nPerson 2:");
        person2.displayDetails();
        System.out.println("\nPerson 3:");
        person3.displayDetails();
        System.out.println("\nPerson 4:");
        person4.displayDetails();
    }
}
