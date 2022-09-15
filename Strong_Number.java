import java.util.*;
class Codemind
{
    static int fact(int a)
    {
        int i,p=1;
        for(i=a;i>0;i--)
        {
            p*=i;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,t,b,s=0;
        a=sc.nextInt();
        t=a;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            s+=fact(b);
        }
        if(s==t)
        {
            System.out.printf("The number %d is a strong number",t);
        }
        else
        {
            System.out.printf("The number %d is not a strong number",t);
        }
        sc.close();
    }
}