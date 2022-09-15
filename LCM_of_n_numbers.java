import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,max=-999999,c=0,j;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            max=a[i];
        }
        for(i=max;;i++)
        {
            c=0;
            for(j=0;j<n;j++)
            {
                if(i%a[j]==0)
                {
                    c++;
                }
            }
            if(c==n)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
}
}