import java.util.*;
class Codemind
{
    public static int adam(int a)
    {
        int r=0,c;
        while(a!=0)
        {
            c=a%10;
            a=a/10;
            r=r*10+c;
        }
       return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=a*a;
        c=adam(a);
        d=c*c;
        if(b==adam(d))
        System.out.printf("True");
        else
        System.out.printf("False");
    }
}