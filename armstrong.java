/*
print armstrong number
 */
public class armstrong {
    public static void main(String args[])
    {
        int n=153;
        int temp=n;
        int p=0;
        int rem;
        while(n>0)
        {
            rem=n%10;
            p=p+rem*rem*rem;
            n=n/10;
        }
        if(temp==p)
        {
            System.out.println("Armstrong");
            
        }
        else
        {
            System.out.println("not armstrong");
        }
        }
    }
    

