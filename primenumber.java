

/*
Write a program that prompts the user to input a positive integer. It 
should then output a message indicating whether the number is a prime 
number.
 */
import java.util.*;
public class primenumber {
    public static void main(String srgs[])
    {
        int num,i,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number : ");
        num=sc.nextInt();
        for(i=2;i<num;i++)      
        {
            if(num%i==0)
            {
                count++;
                break;
            }
        }
        if(count==0)
            System.out.println("this is prime number");
        else
            System.out.println("this is not prime number");
    }    
}
