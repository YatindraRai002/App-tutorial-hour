class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void start() {
        System.out.println("Car is starting...");
    }
}

public class week2Q7 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Ertiga", 2024);
        myCar.start();
    }
}