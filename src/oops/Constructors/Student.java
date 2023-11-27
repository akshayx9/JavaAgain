package oops.Constructors;

public class Student {
    String name;
    int rollNo;
    int age;

    // No-arg constructor
    Student() {
        System.out.println("No-arg constructor is executing!!");
        name = "Suresh";
        age = 10;
        rollNo = 100;
    }

    // Param constructor
    Student(String pname, int page, int prollNo) {
        System.out.println("Param constructor is executing!!");
        name = pname;
        age = page;
        rollNo = prollNo;
    }

    public static void main(String[] args) {

        // creating student objects
        Student s1 = new Student();
        System.out.println(s1.name);
        System.out.println(s1.age);

        System.out.println("________________");

        Student s2 = new Student("Ramesh", 12, 200);
        System.out.println(s2.name);
        System.out.println(s2.age);
    }
}
