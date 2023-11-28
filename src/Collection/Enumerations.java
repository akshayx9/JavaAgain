package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class Enumerations {
    public static void main(String[] args) {

        Vector<Object> v = new Vector<>();
        for (int i = 1; i <= 10; i++) {
            v.addElement(i);
        }

        System.out.println(v);
        System.out.println("*******************");
        Enumeration<Object> e = v.elements();
        while (e.hasMoreElements()) {
            Integer i1 = (Integer) e.nextElement();
            if (i1 % 2 == 0) {
                System.out.println(i1);
            }
        }
    }
}
