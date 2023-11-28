package Collection;

import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer, String> map1 = new TreeMap<>();
        map1.put(100, "Java");
        map1.put(10, ".net");
        map1.put(500, "php");
        System.out.println(map1);

        TreeMap<Integer, String> map2 = new TreeMap<>(new MyComparator());
        map2.put(100, "Java");
        map2.put(10, ".net");
        map2.put(500, "php");
        System.out.println(map2);
    }
}
