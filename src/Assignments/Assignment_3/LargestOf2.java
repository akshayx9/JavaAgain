package Assignments.Assignment_3;

import java.util.Scanner;

public class LargestOf2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=s.nextInt();
        System.out.println("Enter second number:");
        int y=s.nextInt();
        s.close();

        if(x>y){
            System.out.println("The largest number is "+x);
        } else{
          System.out.println("The largest number is "+y);  
        }
    }
}
