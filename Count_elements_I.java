import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,m,i,j,c=0,s=0,k;
        n=sc.nextInt();
        m=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[m];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<m;i++)
        {
            b[i]=sc.nextInt();
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
                    n--;
                    j--;
                }
            }
        }
        for(i=0;i<m;i++)
        {
            for(j=i+1;j<m;j++)
            {
                if(b[i]==b[j])
                {
                    for(k=j;k<m-1;k++)
                    {
                        b[k]=b[k+1];
                    }
                    m--;
                    j--;
                }
            }
        }
        for(i=0;i<n;i++)
        {
            c=0;
           for(j=0;j<m;j++)
           {
               if(a[i]==b[j])
               {
                   c++;
               }
           }
           if(c!=0)
           {
               s++;
           }
        }
        System.out.println(s);
    }
}