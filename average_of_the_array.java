import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,s=0;
        float avg;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        avg=(float)s/n;
        System.out.printf("%.2f",avg);
        sc.close();
    }
}