import java.util.*;
class Codweind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    for(int k=j;k<n-1;k++)
                    {
                        a[k]=a[k+1];
                    }
                    j--;
                    n--;
                }
            }
        }
        if(n<3)
        System.out.println(a[n-1]);
        else
        System.out.println(a[n-3]);
    }
}