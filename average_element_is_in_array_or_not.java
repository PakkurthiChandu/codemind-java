import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0,b,s=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        b=s/n;
        for(i=0;i<n;i++)
        {
            if(a[i]==b)
            {
                c++;
                break;
            }
        }
        if(c!=0)
        System.out.printf("True");
        else
        System.out.printf("False");
        sc.close();
    }
}