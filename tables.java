/*
print tables 1 to 10
 */
public class tables {
    public static void main(String args[])
    {
        int i,j;
        for(i=1;i<=20;i++)
        {
            for(j=1;j<=10;j++)
            {
                System.out.println(i+"*"+j+"="+(i*j));
            }
            System.out.println("------------");
        }
    }
    
}
