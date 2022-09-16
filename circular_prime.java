import java.util.*;
class Codemind
{
    static int prime(int a)
    {
        if(a==1)
        {
            return 0;
        }
        int i;
        for(i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    static int rev(int a)
    {
        int b,r=0;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            r=r*10+b;
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,i;
        a=sc.nextInt();
        if(prime(a)==1)
        {
            if(prime(rev(a))==1)
            {
                System.out.println("circular prime");
            }
            else
            {
                System.out.println("prime but not a circular prime");
            }
        }
        else
        {
            System.out.println("not prime");
        }
        sc.close();
    }
}