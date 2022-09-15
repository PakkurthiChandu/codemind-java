import java.util.*;
class Codemind
{
    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int b,c,i,j,s=0,d=0;
        b=sc.nextInt();
        c=sc.nextInt();
        int[] a=new int[b];
        for(i=0;i<b;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<b;i++)
        {
            s=0;
            for(j=i;j<b;j++)
            {
                s+=a[j];
                if(s==c)
                {
                    d++;
                }
            }
        }
        System.out.println(d);
    }
}