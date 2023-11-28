package Collections;

import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("A");
        list.add(300);
        list.add(200);
        list.add(null);
        list.add(200);
        System.out.println(list);// [A,300,200,null,200]
        list.remove(0);
        System.out.println(list);// [300,200,null,200]
        System.out.println(list.get(2));// null
        list.set(2, "JAVA");
        System.out.println(list);
    }
}
