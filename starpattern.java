/*
star pattern
 */
public class starpattern {
    public static void main(String args[])
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(k=1;k<=i;k++)
            {           
                 System.out.print("* ");
            }
            
            System.out.println();
        }
        for(i=5;i>=1;i--)
        {
            for(k=i;k>=1;k--)
            {           
                 System.out.print("* ");
            }
            
            System.out.println();
        }
    }
    
}
