package oops.Interfaces;

public class Child implements Father, Mother {
    public static void main(String[] args) {
        System.out.println((Father.h + Mother.h) / 2);
    }
}
