import java.util.*;
class Codemind
{
    public static int print(int[] a,int n,int sum)
    {
        if(n==-1)
        {
        return sum;
        }
        sum+=a[n];
        return print(a,n-1,sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,sum=0;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(print(a,n-1,sum));
    }
}