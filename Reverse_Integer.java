import java.util.*;
class Codemind
{
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
        int a;
        a=sc.nextInt();
        if(a<0)
        {
            a=-a;
            System.out.printf("%d",-rev(a));
        }
        else
        {
            System.out.println(rev(a));
        }
        sc.close();
    }
}