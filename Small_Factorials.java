import java.util.*;
class Codemind
{
    static int fact(int a)
    {
        int p=1,i;
        for(i=a;i>0;i--)
        {
            p*=i;
        }
        return p;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            System.out.printf("%d
",fact(a[i]));
        }
        sc.close();
}
}