package Assignments.Assignment_3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int a=s.nextInt();
        s.close();

        if(a%2==0){
            System.out.println("The number "+a+" is even");
        }else{
            System.out.println("The number "+a+" is odd");
        }
    }
}
