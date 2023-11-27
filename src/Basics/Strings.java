package Basics;

public class Strings {
    public static void main(String[] args) {
        // Char to String
        char[] ch = { 'a', 'b', 'c' };
        String s = new String(ch);
        System.out.println(s);

        String s1 = "java";
        System.out.println(s1.length());// method to find length of a String - 4
        System.out.println(s1.charAt(2));// v

        String s2 = " tech";
        String s3 = s1.concat(s2);// concatenation method
        System.out.println(s3);

        String s4 = "JAVA";
        System.out.println(s1.equals(s4));// false - To check if two strings are same
        System.out.println(s1.equalsIgnoreCase(s4));// true - case is ignored
        System.out.println(s1.replace('a', 'z'));// jzvz - replacing chars
        System.out.println(s1.replace("ja", "hibernate"));// replacing substrings

        System.out.println(s3.toUpperCase());// convert to upper case
        System.out.println(s3.toLowerCase());// convert to lower case

        System.out.println(s1.indexOf('a'));// index at first occurrence
        System.out.println(s1.lastIndexOf('a'));// index at last occurrence

        String s5 = "  java tech  ";
        System.out.println(s5.substring(5));
        System.out.println(s5.substring(0, 5));
        System.out.println(s5.trim());// trim spaces
    }
}
