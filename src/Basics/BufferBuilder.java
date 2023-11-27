package Basics;

public class BufferBuilder {
    // Program to show use of StringBuffer & StringBuilder classes
    public static void main(String[] args) {
        StringBuilder sbf = new StringBuilder();// creates a string buffer with capacity of 16
        System.out.println(sbf.capacity());
        StringBuilder sbf1 = new StringBuilder(100);// creates a string buffer with capacity of 100
        System.out.println(sbf1.capacity());

        StringBuilder sbf2 = new StringBuilder("java");// creates a string buffer with "java" inside it
        sbf2.append(" tech");// adds " tech" to string "java" - java tech
        System.out.println(sbf2);

        sbf2.insert(0, "hibernate");// inserting at index
        sbf2.insert(2, "JDBC");// hiJDBCbernatejava tech
        System.out.println(sbf2);

        sbf2.delete(0, 3);// deletes substring
        sbf2.deleteCharAt(6);// deletes char at index
        System.out.println(sbf2);

        sbf2.reverse();// prints string in reverse
        System.out.println(sbf2);

        /*
         * all the methods used for String & StringBuffer class also apply for
         * StringBuilder class
         * the only difference is that StringBuilder class methods are not syncronized.
         * That is also why we use it in realtime.
         */
    }
}
