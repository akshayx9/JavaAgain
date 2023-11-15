package Assignments.Assignment_3;

//Swap values of two variables

public class Swap {
    public static void main(String[] args) {
        
        //case 1
        int x1=10, y1=20;
        int z1=y1;
        y1=x1;
        x1=z1;
        System.out.println(x1);
        System.out.println(y1);

        //case 2
        int x2=10, y2=20;
        x2=x2+y2;
        y2=x2-y2;
        x2=x2-y2;
        System.out.println(x2);
        System.out.println(y2);

        //case 3
        int x3=10, y3=20;
        x3=(x3*y3)/(y3=x3);
        System.out.println(x3);
        System.out.println(y3);
    }    
}
