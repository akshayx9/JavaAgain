package Basics;

public class AnonArray {

    public static void m1(int[] x) {
        System.out.println(x[0]);
        System.out.println(x[1]);
    }

    public static void main(String[] args) {
        m1(new int[] { 10, 20, 30 });// Anonymous array
    }
}
