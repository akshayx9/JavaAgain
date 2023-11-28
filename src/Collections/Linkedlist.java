package Collections;

import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<Object> list = new LinkedList<>();
        list.add("JAVA");
        list.add(100);
        list.add(null);
        list.add("JAVA");
        System.out.println(list);
        list.set(0, "JDBC");
        System.out.println(list);
        list.removeLast();
        list.addFirst("ABC");
        System.out.println(list);
    }
}
