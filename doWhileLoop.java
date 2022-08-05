/*
 Write a do-while loop that asks the user to enter two numbers. The 
numbers should be added and the sum displayed. The loop should ask the 
user whether he or she wishes to perform the operation again. If so, the 
loop should repeat; otherwise it should terminate.
 */
import java.util.*;
public class doWhileLoop {
    public static void main(String args[])
    {
        int fno,sno,sum;
         char op;
        Scanner sc=new Scanner(System.in);
        do
        {
        System.out.println("enter first no = ");
        fno=sc.nextInt();
        System.out.println("enter second no = ");
        sno=sc.nextInt();

            sum = fno+sno;
            System.out.println("sum = "+sum);
            
            System.out.println("he or she wishes to perform the operation again, Y/N");
            op=sc.next().charAt(0);
           
        
        
        }while(op=='Y'||op=='y');
        
    }
    
}
