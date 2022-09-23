
import java.util.*;
class Codemind
{
    public static int fact_sum(int a)
    {
        int i,sum=0;
        for(i=a/2;i>0;i--)
        {
            if(a%i==0)
            {
                sum+=i;
            }
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        if(fact_sum(a)>=a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}