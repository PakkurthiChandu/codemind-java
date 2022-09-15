import java.util.*;
class Codemind
{
    static int prime(int a)
    {
        int i;
        if(a==1)
        {
            return 0;
        }
        for(i=2;i*i<=a;i++)
        {
            if(a%i==0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a+b+1;;i++)
        {
            if(prime(i)==1)
            {
                System.out.printf("%d",i-(a+b));
                break;
            }
        }
        sc.close();
}
}