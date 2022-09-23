import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,sum=0,b;
        n=sc.nextInt();
        b=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=b;i<n;i++)
        {
            System.out.printf("%d ",a[i]);
        }
        for(i=0;i<b;i++)
        System.out.printf("%d ",a[i]);
    }
}