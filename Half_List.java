import java.util.*;
class Codemind
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b,i;
        b=sc.nextInt();
        int[] a=new int[b];
        for(i=0;i<b;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=b-1;i>=b/2;i--)
        {
            System.out.printf("%d ",a[i]);
        }
        for(i=0;i<b/2;i++)
        {
            System.out.printf("%d ",a[i]);
        }
        sc.close();
    }
}