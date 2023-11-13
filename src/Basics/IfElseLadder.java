package Basics;

//Program to find max of 3 numbers using If-Else Ladder

public class IfElseLadder {
    
    public static void main(String[] args) {
        
        int x=10;
        int y=20;
        int z=30;

        if(x>y && x>z){
            System.out.println("MAX="+x);
        }else if(y>z){
            System.out.println("MAX="+y);
        }else{
            System.out.println("MAX="+z);
        }
    }
}
