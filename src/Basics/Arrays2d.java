package Basics;

public class Arrays2d {
    public static void main(String[] args) {
        int[][] x = new int[2][2];

        x[0][0] = 100;
        x[0][1] = 200;

        x[1][0] = 300;
        x[1][1] = 400;

        // for-each
        for (int[] y : x) {
            // Converting 2-d array to 1-array first

            System.out.println("***********");
            for (int z : y) {
                // then converting the 1-d array to individual values
                System.out.println(z);
            }
        }
    }
}
