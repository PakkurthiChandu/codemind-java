import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}