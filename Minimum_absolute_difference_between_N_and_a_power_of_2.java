import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int c=0,b=0,t=0;
        while(b<a)
        {
            t=b;
            b=(int)Math.pow(2,c);
            c++;
        }
        if((b-a)==0)
        {
            System.out.println("0");
        }
        else if((b-a)<(a-t))
        {
            System.out.println(b-a);
        }
        else
        {
            System.out.println(a-t);
        }
    }
}