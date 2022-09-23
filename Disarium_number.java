
import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i=1,s=0,d,b;
        a=sc.nextInt();
        int t=a;
        d=(int)Math.log10(a);
        while(a!=0)
        {
            b=a/(int)Math.pow(10,d);
            a=a%(int)Math.pow(10,d);
            s+=Math.pow(b,i);
            i++;
            d--;
        }
        if(s==t)
        System.out.print("True");
        else
        System.out.print("False");
    }
}