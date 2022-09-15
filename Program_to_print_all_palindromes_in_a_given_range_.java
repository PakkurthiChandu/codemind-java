import java.util.*;
class Codemind
{
    static int pal(int a)
    {
        int b,r=0,t=a;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            r=r*10+b;
        }
        if(r==t)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(pal(i)==1)
            {
                System.out.printf("%d ",i);
            }
        }
        sc.close();
}
}