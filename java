// Abstract base class
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method (must be overridden)
    public abstract void displayDetails();
}

// Derived class 1: Student
class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age); // call to parent class constructor
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println();
    }
}

// Derived class 2: Teacher
class Teacher extends Person {
    private String subjectCode;

    public Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    public void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println();
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Reference of type Person
        Person personRef;

        // Assign Student object
        personRef = new Student("Riya Sharma", 20, 101);
        personRef.displayDetails();  // Runtime polymorphism (Student's method executes)

        // Assign Teacher object
        personRef = new Teacher("Aditya Verma", 35, "CS301");
        personRef.displayDetails();  // Runtime polymorphism (Teacher's method executes)
    }
}
