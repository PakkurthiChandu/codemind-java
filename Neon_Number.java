import java.util.*;
class Codemind
{
    static int neon(int a)
    {
        int b=a*a,c,s=0;
        while(b!=0)
        {
            c=b%10;
            b=b/10;
            s+=c;
        }
        if(s==a)
        {
            return 1;
        }
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,j,a;
        n=sc.nextInt();
        if(neon(n)==1)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
        sc.close();
    }
}