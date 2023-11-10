package Basics;

public class Increment_Decrement {
    public static void main(String[] args) {
        int x = 4;//5
        int y = ++x;//5 - pre-increment
        int a = 4;//5
        int b = a++;//4 - post-increment

        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);

        int x1 = 4;//3
        int y1 = --x1;//3 - pre-decrement
        int a1 = 4;//3
        int b1 = a1--;//4 - post-decrement

        System.out.println(x1);
        System.out.println(y1);
        System.out.println(a1);
        System.out.println(b1);
    }
}
