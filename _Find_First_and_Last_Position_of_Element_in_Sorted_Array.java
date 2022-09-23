import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b,i,c=0,f=0,s=0;
        n=sc.nextInt();
        int[]  a=new int[n];
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        b=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(a[i]==b && c==0)
            {
                c++;
                f=i;
            }
            if(a[i]==b)
            {
                s=i;
            }
        }
        if(c==0)
        System.out.print("-1 -1");
        else
        System.out.printf("%d %d",f,s);
    }
}