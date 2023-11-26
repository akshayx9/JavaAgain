package Assignments.Assignment_3;

import java.util.Scanner;

//Find the Largest, Middle & Smallest of 3 no's

public class LargestMidSmall {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number:");
        int x=s.nextInt();
        System.out.println("Enter second number:");
        int y=s.nextInt();
        System.out.println("Enter third number:");
        int z=s.nextInt();
        s.close();

        if(x>y && x>z) {
            System.out.println("The Largest Number is "+x);
            if(y>z) {
                System.out.println("The Middle Number is "+y);
                System.out.println("The Smallest number is "+z);
            } else {
               System.out.println("The Middle Number is "+z);
               System.out.println("The Smallest number is "+y); 
            }
        } else if(y>x && y>z) {
            System.out.println("The Largest Number is "+y);
            if(x>z) {
                System.out.println("The Middle Number is "+x);
                System.out.println("The Smallest number is "+z);
            } else {
               System.out.println("The Middle Number is "+z);
               System.out.println("The Smallest number is "+x); 
            }
        } else if(z>y && z>x) {
            System.out.println("The Largest Number is "+z);
            if(y>x) {
                System.out.println("The Middle Number is "+y);
                System.out.println("The Smallest number is "+x);
            } else {
               System.out.println("The Middle Number is "+x);
               System.out.println("The Smallest number is "+y); 
            }
        }       
    }
    
}
