import java.util.*;
class Codemind
{
    public static boolean pal(int a)
    {
        int d,b,c;
        d=(int)Math.log10(a);
        while(a!=0)
        {
            b=a/(int)Math.pow(10,d);
            c=a%10;
            if(b!=c)
            {
                return false;
            }
            a=a%(int)Math.pow(10,d);
            a=a/10;
            d-=2;
        }
        return true;
    }
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        pal(a);
        if(pal(a))
        {
            System.out.print("True");
        }
        else
        System.out.print("False");
    }
}