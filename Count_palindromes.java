
import java.util.*;
class Main{
    static int pal(int a){
        int b,r=0,c=a;
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            r=r*10+b;
        }
        if(r==c)
        {
            return 1;
        }
        else
        return 0;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(pal(a[i])==1)
            {
                c++;
            }
        }
        System.out.println(c);
    }
    
}
    