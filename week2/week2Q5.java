class Student {
    int rollNo;
    String name;
    double marks;

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class week2Q5 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Amit", 85.5);
        Student s2 = new Student(2, "Priya",75);
        Student s3 = new Student(3, "Rahul", 90.0);
        s1.display();
        s2.display();
        s3.display();
    }
}