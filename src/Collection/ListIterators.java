package Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterators {
    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        System.out.println(list);
        System.out.println("*******************");

        ListIterator<Object> itr = list.listIterator();
        while (itr.hasNext()) {
            Integer i1 = (Integer) itr.next();
            if (i1 == 2) {
                itr.set(200);
            }
            if (i1 == 10) {
                itr.add(11);
            }
        }
        System.out.println("Final List::" + list);
    }
}
