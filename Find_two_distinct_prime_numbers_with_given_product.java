import java.util.*;
class Codmind
{
    public static boolean prime(int a)
    {
        if(a==1)
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
        int a,c=0;
        a=sc.nextInt();
        for(int i=2;i<=a;i++)
        {
            if(prime(i))
            {
                for(int j=2;j<=a;j++)
                {
                    if(prime(j)&&(i*j)==a)
                    {
                        System.out.printf("%d %d",i,j);
                        c=1;
                        break;
                    }
                }
            }
            if(c==1)
            break;
        }
        if(c==0)
        System.out.println("-1");
    }
}