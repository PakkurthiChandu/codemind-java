import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,b,i=0,j,d;
        n=sc.nextInt();
        b=(int)Math.log10(n)+1;
        int[] a=new int[b];
        while(n!=0)
        {
            d=n%10;
            n=n/10;
            a[i]=d;
            i++;
        }
        for(i=0;i<b;i++)
        {
            for(j=i+1;j<b;j++)
            {
                if(a[i]==a[j])
                {
                    c++;
                    System.out.print("Not Unique Number");
                    break;
                }
            }
            if(c!=0)
            {
                break;
            }
        }
        if(c==0)
        System.out.print("Unique Number");
    }
}