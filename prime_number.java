import java.util.*;
class Codemind
{
    static int prime(int a)
    {
        if(a==1)
        return 0;
        int i;
        for(i=2;i*i<=a;i++)
        {
            if(a%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a;
        a=sc.nextInt();
        if(prime(a)==1)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not a prime");
        }
        sc.close();
    }
}