import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0;
        a=sc.nextInt();
        while(a>=10)
        {
            while(a!=0)
            {
                b=a%10;
                a=a/10;
                s+=b;
            }
            a=s;
            s=0;
        }
        System.out.println(a);
    }
}