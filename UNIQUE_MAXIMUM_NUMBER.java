import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int i,max=-99999;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            int c=0;
            for(int j=0;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==1 && a[i]>max)
            {
                max=a[i];
            }
        }
        if(max==-99999)
        System.out.println("-1");
        else
        System.out.println(max);
    }
}