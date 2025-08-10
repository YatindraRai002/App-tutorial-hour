class Mobile {
    String brand;
    String model;
    double price;

    Mobile(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void showDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class week2Q2 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Galaxy A51", 25000.0);
        Mobile m2 = new Mobile("Apple", "iPhone 16", 12500.0);
        Mobile m3 = new Mobile("OnePlus", "12R", 45999.0);

        m1.showDetails();
        m2.showDetails();
    }
}