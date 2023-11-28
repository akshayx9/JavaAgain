package Collection;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(200);
        set.add(300);
        set.add(100);
        set.add(50);
        System.out.println(set);// [50,100,200,300]
        set.add(null);// NullPointerEx - as we can't store null values
    }
}
