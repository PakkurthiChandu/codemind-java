import java.util.*;
class Codemind
{
    static int rev(int a)
    {
        int b,r=0;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            r=r*10+b;
        }
        return r;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,min=999999,i,j,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]<min)
            min=a[i];
        }
        for(i=min;i>0;i--)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[j]%i==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
}
}