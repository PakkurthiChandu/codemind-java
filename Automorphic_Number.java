import java.util.*;
class Codemind 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d;
        a=sc.nextInt();
        b=(int)Math.log10(a)+1;
        c=a*a;
        d=c%(int)Math.pow(10,b);
        if(a==d)
        {
            System.out.println("Automorphic Number");
        }
        else
        {
             System.out.println("Not an Automorphic Number");
        }
    }
}