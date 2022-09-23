import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b=0,f,s;
        a=sc.nextInt();
        f=0;
        s=1;
        while(b<=a)
        {
            b=f+s;
            f=s;
            s=b;
        }
        if(f==a)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
    }
}