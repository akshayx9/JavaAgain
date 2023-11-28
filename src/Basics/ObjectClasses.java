package Basics;

public class ObjectClasses implements Cloneable {
    String name;
    int rollNo;
    int i = 10;
    int j = 20;

    ObjectClasses(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    ObjectClasses() {
        System.out.println("*******");
    }

    public String toString() {
        return name + "-->" + rollNo;
    }

    public int hashCode() {
        return rollNo;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        // toString() method
        ObjectClasses s1 = new ObjectClasses("Suresh", 100);
        System.out.println(s1.toString());

        // hashCode() method - JVM generates a random number based on memory location
        // for every object & we can override this method to give our own values.
        System.out.println(s1.hashCode());
        ObjectClasses s2 = new ObjectClasses("Ramesh", 101);
        System.out.println(s2.hashCode());

        // equals() method - checks if the memory location is same or not.
        ObjectClasses s3 = new ObjectClasses("Suresh", 100);
        System.out.println(s1.equals(s3));// false

        // clone() method - can be used to clone an object & it's properties.
        ObjectClasses d1 = new ObjectClasses();
        ObjectClasses d2 = (ObjectClasses) d1.clone();
        d1.i = 100;
        d1.j = 200;
        System.out.println(d2.i + "-->" + d2.j);
    }
}
