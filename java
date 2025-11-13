class Person {
    String name;
    int age;

    void inputPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    void inputStudent(String name, int age, int rollNumber) {
        inputPerson(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudent() {
        System.out.println("STUDENT DETAILS");
        displayPerson();
        System.out.println("UID: " + rollNumber);
    }
}

class Teacher extends Person {
    String subjectCode;

    void inputTeacher(String name, int age, String subjectCode) {
        inputPerson(name, age);
        this.subjectCode = subjectCode;
    }

    void displayTeacher() {
        System.out.println("TEACHER DETAILS");
        displayPerson();
        System.out.println("SUBJECT CODE: " + subjectCode);
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputStudent("KAVYANSH", 20, 10677);
        s.displayStudent();

        System.out.println();

        Teacher t = new Teacher();
        t.inputTeacher("MR.ROHAN", 78, "TC868");
        t.displayTeacher();
    }
}
