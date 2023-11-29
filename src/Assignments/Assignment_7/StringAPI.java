package Assignments.Assignment_7;

public class StringAPI {
    public static void main(String[] args) {
        String str = "Welcome to Java World";
        System.out.println(str.charAt(5));
        System.out.println(str.equalsIgnoreCase("Welcome"));
        System.out.println(str.concat(" - Let us learn"));
        System.out.println(str.indexOf('a'));
        System.out.println(str.replace('a', 'e'));
        System.out.println(str.substring(4, 10));
        System.out.println(str.toLowerCase());
    }
}
