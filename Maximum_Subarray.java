import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0,max=-99999999;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
           for(j=i;j<n;j++)
           {
               sum+=a[j];
               if(sum>max)
               {
                   max=sum;
               }
           }
           sum=0;
        }
       System.out.print(max);
    }
}