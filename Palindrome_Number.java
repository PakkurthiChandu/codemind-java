import java.util.*;
class Codemind
{
    static int pal(int a)
    {
        int t=a,b,r=0;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            r=r*10+b;
        }
        if(r==t)
        return 1;
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,a;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            a=sc.nextInt();
            if(pal(a)==1)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
        sc.close();
    }
}