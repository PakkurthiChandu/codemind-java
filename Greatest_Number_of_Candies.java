import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[] a=new int[n];
        int max=-99999;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        int c=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(c+a[i]>=max)
            {
                System.out.printf("True ");
            }
            else
            {
                System.out.printf("False ");
            }
        }
    }
}