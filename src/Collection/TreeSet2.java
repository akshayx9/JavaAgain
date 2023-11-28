package Collection;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>(new MyComparator());
        set.add(100);
        set.add(10);
        set.add(50);
        System.out.println(set);
    }
}
