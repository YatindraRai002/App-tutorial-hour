import java.io.*;
import java.util.*;

class Room {
    int number;
    String type;
    double price;
    boolean available = true;

    Room(int number, String type, double price) {
        this.number = number;
        this.type = type;
        this.price = price;
    }
}

class Customer {
    String name;
    String contact;

    Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }
}

class Reservation {
    Customer customer;
    Room room;
    String date;

    Reservation(Customer customer, Room room, String date) {
        this.customer = customer;
        this.room = room;
        this.date = date;
    }
}

class Hotel {
    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Reservation> reservations = new ArrayList<>();

    void addRoom(Room room) {
        rooms.add(room);
    }

    Room findAvailableRoom() {
        for (Room room : rooms) {
            if (room.available) return room;
        }
        return null;
    }

    void bookRoom(Customer customer, String date) {
        Room room = findAvailableRoom();
        if (room != null) {
            reservations.add(new Reservation(customer, room, date));
            room.available = false;
            System.out.println("Room booked for " + customer.name);
        } else {
            System.out.println("No rooms available.");
        }
    }

    void cancelReservation(String customerName) {
        Iterator<Reservation> it = reservations.iterator();
        while (it.hasNext()) {
            Reservation r = it.next();
            if (r.customer.name.equals(customerName)) {
                r.room.available = true;
                it.remove();
                System.out.println("Reservation cancelled for " + customerName);
                return;
            }
        }
        System.out.println("Reservation not found.");
    }

    void saveReservations() throws Exception {
        PrintWriter writer = new PrintWriter("reservations.csv");
        for (Reservation r : reservations) {
            writer.println(r.customer.name + "," + r.room.number + "," + r.date);
        }
        writer.close();
        System.out.println("Reservations saved to file.");
    }
}

public class week4Q4 {
    public static void main(String[] args) throws Exception {
        Hotel hotel = new Hotel();
        hotel.addRoom(new Room(1, "Single", 500));
        hotel.addRoom(new Room(2, "Double", 800));

        Customer customer = new Customer("Amit", "1234567890");
        hotel.bookRoom(customer, "2025-08-15");

        hotel.cancelReservation("Amit");
    }
}