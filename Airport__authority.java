import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(a[i]<=b)
            {
                c+=1;
            }
            else
            {
                c+=2;
            }
        }
        System.out.println(c);
    }
}