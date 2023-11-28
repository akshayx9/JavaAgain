package Collections;

import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
        Vector<Object> v = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }
        System.out.println(v);
        System.out.println(v.capacity());// inital capacity is 10
        v.add(11);// adding an extra element doubles the capacity
        System.out.println(v.capacity());
        System.out.println(v);
    }
}
