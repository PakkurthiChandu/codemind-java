import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int[] a=new int[n];
        int[] b=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            b[i]=a[i]*a[i];
        }
        for(i=0;i<n;i++)
        {
           for(int j=i+1;j<n;j++)
           {
               if(b[i]>b[j])
               {
                   int t=b[i];
                   b[i]=b[j];
                   b[j]=t;
               }
           }
        }
        for(i=0;i<n;i++)
        System.out.printf("%d ",b[i]);
    }
}