import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,count=0,j;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
        a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            c=0;
            for(j=i+1;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
            if(c==0 && a[i]%2==0)
            {
                count++;
            }
        }
        System.out.println(count);
        sc.close();
    }
}