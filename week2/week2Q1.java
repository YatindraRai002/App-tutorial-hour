class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

public class week2Q1 {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Virat", 101, 50000.0);
        Employee emp2 = new Employee("Rohit", 102, 40000.0);

        emp1.displayDetails();
        emp2.displayDetails();
    }
}