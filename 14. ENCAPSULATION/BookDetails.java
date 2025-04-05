
class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b = new Book();
        b.setTitle("Java Basics");
        b.setAuthor("Jane Doe");
        b.setPrice(299.99);

        System.out.println("Book Title: " + b.getTitle());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: $" + b.getPrice());
    }
}
