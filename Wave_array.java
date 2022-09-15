import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,s=0;
        n=sc.nextInt();
        int[] a= new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        if(a[0]>a[1])
        {
            c=1;
        }
        if(c==0)
        {
            for(i=1;i<n-1;i=i+2)
            {
                if(a[i]>a[i-1] && a[i]>a[i+1])
                {
                    continue;
                }
                else
                {
                 s++;
                 break;
                }
            }
            if(s==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
        else
        {
             for(i=1;i<n-1;i=i+2)
            {
                if(a[i]<a[i-1] && a[i]<a[i+1])
                {
                    continue;
                }
                else
                {
                 s++;
                 break;
                }
            }
            if(s==0)
            {
                System.out.println("yes");
            }
            else
            {
                System.out.println("no");
            }
        }
    }
}