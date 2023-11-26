package oops.Inheritance;

public class Child extends Parent {

    public void m2() {
        System.out.println("Inside Child m2() method!!");
    }

    public static void main(String[] args) {
        // case1
        Parent p1 = new Parent();
        p1.m1();

        // case2
        Child c = new Child();
        c.m1();
        c.m2();
        ;

        // case3
        Parent p2 = new Child();
        p2.m1();
    }
}
