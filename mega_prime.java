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
        int i,b,a,s=0,c=0;
        a=sc.nextInt();
        if(prime(a)==1)
        {
            while(a!=0)
            {
                b=a%10;
                a=a/10;
                c++;
                s+=prime(b);
            }
            if(s==c)
            {
                System.out.println("Mega Prime");
            }
            else
            {
            System.out.println("Not Mega Prime");
            }
        }
        else
        {
            System.out.println("Not Mega Prime");
        }
        sc.close();
    }
}