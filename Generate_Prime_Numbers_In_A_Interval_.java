import java.util.*;
class codemind
{
    public static boolean prime(int a)
    {
        if(a<=1)
        return false;
        for(int i=2;i*i<=a;i++)
        {
            if(a%i==0)
            return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(prime(i))
            System.out.println(i);
        }
    }
}