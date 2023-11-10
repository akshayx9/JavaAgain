package oops;

public class Student extends Teacher {

    int rollNo;

    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "teacher1";
        t.age = 45;
        t.salary = 8000.00f;
        System.out.println(t.name);
        System.out.println(t.age);
        System.out.println(t.salary);

        System.out.println("__________");

        Student s = new Student();
        s.name = "Ramesh";
        s.age = 20;
        s.rollNo = 200;

        System.out.println(s.name);
        System.out.println(s.age);
        System.out.println(s.rollNo);
    }
    
}
