package Collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Object> {
    public int compare(Object obj1, Object obj2) {
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        if (i1 < i2) {
            return 10;
        } else if (i1 > i2) {
            return -89;
        } else {
            return 0;
        }

    }

}
