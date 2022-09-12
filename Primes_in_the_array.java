import java.util.*;
class Codemind
{
    static int prime(int a)
    {
        if(a==1)
        {
            return 0;
        }
        int i;
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
        int n,c=0,i;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(prime(a[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}