class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    double discountedPrice(double discountPercent) {
        return price - (price * discountPercent / 100);
    }
}

public class week2Q6 {
    public static void main(String[] args) {
        Book b = new Book("Atomic Habits", "James Clear", 450);
        double discounted = b.discountedPrice(10); 
        System.out.println("Title: " + b.title);
        System.out.println("Author: " + b.author);
        System.out.println("Original Price: " + b.price);
        System.out.println("Price after 10% discount: " + discounted);
    }
}
