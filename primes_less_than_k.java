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
        int n,b,i,j,k,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    n--;
                    j--;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            if(a[i]<=b && prime(a[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}