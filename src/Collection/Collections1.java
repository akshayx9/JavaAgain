package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Collections1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(400);
        list.add(200);
        list.add(500);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 200));

        Collections.reverse(list);
        System.out.println(list);
    }
}
