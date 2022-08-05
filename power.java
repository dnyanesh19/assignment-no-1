/*
Two numbers are entered through the keyboard. Write a program to find the 
value of one number raised to the power of another. (Do not use Java 
built-in method).

 */
import java.util.*;
import java.lang.Math;
public class power {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double n;
        double m;
        System.out.println("enter number = ");
        n=sc.nextInt();
        System.out.println("enter number = ");
        m=sc.nextInt();
        
        System.out.println(Math.pow(n,m));
        
    }
    
}
