package Collection;

import java.util.Arrays;
import java.util.List;

public class Arrays1 {
    public static void main(String[] args) {
        int[] x = { 100, 30, 300 };
        System.out.println("Before Sorting!!");
        for (int y : x) {
            System.out.println(y);
        }

        Arrays.sort(x);
        System.out.println("After Sorting!!");
        for (int y : x) {
            System.out.println(y);
        }

        System.out.println(Arrays.binarySearch(x, 300));

        String[] str = { "java", ".net", "php" };
        List<String> list = Arrays.asList(str);// Converting an array to a list
        System.out.println(list);
        System.out.println("****************");

        Object[] objArray = list.toArray();
        for (Object element : objArray) {
            System.out.println(element);
        }
    }

}
