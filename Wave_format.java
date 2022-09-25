import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b,c=0,s,i,j,t;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        i=n-2;
        j=n-1;
        while(j>=0 || i>=0)
        {
            if(i>=0)
            System.out.printf("%d ",a[i]);
            if(j>=0)
            System.out.printf("%d ",a[j]);
            i-=2;
            j-=2;
        }
    }
}