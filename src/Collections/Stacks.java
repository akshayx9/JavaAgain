package Collections;

import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<Object> s = new Stack<>();
        s.push('A');
        s.push('B');
        s.push('C');
        System.out.println(s);// [A,B,C]
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s);

        System.out.println(s.search('A'));
        System.out.println(s.search('Z'));
    }
}
