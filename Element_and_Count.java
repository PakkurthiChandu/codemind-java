import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,t,j,k;
        n=sc.nextInt();
        t=n;
        int[] a= new int[n];
        int[] b= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i];
        }
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
                    j--;
                    n--;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            c=0;
          for(j=0;j<t;j++)
          {
              if(a[i]==b[j])
              {
                  c++;
              }
          }
          System.out.printf("%d %d ",a[i],c);
        }
    }
}