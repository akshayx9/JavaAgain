package Basics;

public class WrapperClasses {
    public static void main(String[] args) {
        // valueOf() method
        Integer i1 = Integer.valueOf(300);
        Integer i2 = Integer.valueOf("300");
        System.out.println(i1);
        System.out.println(i2);

        // xxValue() method
        Float f = Float.valueOf(100);
        int n = f.intValue();
        short s = f.shortValue();
        float f1 = f.floatValue();
        System.out.println(n);
        System.out.println(s);
        System.out.println(f1);

        // parseXX() method
        String s1 = "400";
        int x = Integer.parseInt(s1);
        float f2 = Float.parseFloat(s1);
        long l = Long.parseLong(s1);
        System.out.println(x);
        System.out.println(f2);
        System.out.println(l);

        // toString() method
        String str = Integer.toString(200);
        System.out.println(str);
    }
}
