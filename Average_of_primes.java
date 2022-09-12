import java.util.*;
class Codemind
{
    static int Prime(int a)
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
        int n,i,c=0;
        float avg,s=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(Prime(a[i])==1)
            {
                s+=a[i];
                c+=1;
            }
        }
        avg=s/c;
        System.out.printf("%.2f",avg);
        sc.close();
    }
}