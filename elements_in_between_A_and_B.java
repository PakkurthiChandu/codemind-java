import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,i,d=0;
        a=sc.nextInt();
        int[] arr=new int[a];
        for(i=0;i<a;i++)
        arr[i]=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=0;i<a;i++)
        {
            if(arr[i]>=b&&arr[i]<=c)
            {
                System.out.printf("%d ",arr[i]);
                d++;
            }
        }
        if(d==0)
        {
            System.out.println("-1");
        }
    }
}