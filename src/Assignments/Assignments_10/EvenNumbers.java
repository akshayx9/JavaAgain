package Assignments.Assignments_10;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Collections;

public class EvenNumbers {

    ArrayList<Integer> A1 = new ArrayList<>();
    ArrayList<Integer> A2 = new ArrayList<>();

    public ArrayList<Integer> storeEvenNumbers(int N) {
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                A1.add(i);
            }
        }
        return A1;
    }

    public ArrayList<Integer> printEvenNumbers() {
        ListIterator<Integer> itr = A1.listIterator();
        while (itr.hasNext()) {
            Integer i1 = itr.next();
            A2.add(i1 * 2);
        }
        System.out.println(A2);

        return A2;
    }

    public int retrieveEvenNumber(int N) {

        if (Collections.binarySearch(A1, N) >= 0) {
            return N;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        EvenNumbers e = new EvenNumbers();
        e.storeEvenNumbers(20);
        e.printEvenNumbers();
        System.out.println(e.retrieveEvenNumber(12));
    }
}
