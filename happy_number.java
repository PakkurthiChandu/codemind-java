import java.util.*;
class Codemind
{
    public static int sum_sq(int a)
    {
        int sum=0,b;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            sum+=b*b;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max=0;
        a=sc.nextInt();
        while(a>=10)
        {
            a=sum_sq(a);
        }
        if(a==1||a==7)
        {
            System.out.printf("True");
        }
        else
        System.out.print("False");
        sc.close();
    }
}