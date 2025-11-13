abstract class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void displayDetails();
}

class Student extends Person {
    private int rollNumber;

    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Student Details ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println();
    }
}

class Teacher extends Person {
    private String subjectCode;

    public Teacher(String name, int age, String subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    public void displayDetails() {
        System.out.println("=== Teacher Details ===");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subjectCode);
        System.out.println();
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Person personRef;

        personRef = new Student("Riya Sharma", 20, 101);
        personRef.displayDetails();

        personRef = new Teacher("Aditya Verma", 35, "CS301");
        personRef.displayDetails();
    }
}
