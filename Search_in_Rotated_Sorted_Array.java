import java.util.*;
class Codemind
{
    public static int Binary_Search(int[] a,int f,int s,int se)
    {
        int m;
        while(f<=s)
        {
            m=(f+s)/2;
            if(a[m]==se)
            {
                return m;
            }
            else if(a[m]>se)
            {
                s=m-1;
            }
            else
            {
                f=m+1;
            }
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),se,t=0,i;
        int[] a=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(i!=0 && a[i]<a[i-1])
            {
                t=i;
            }
        }
        se=sc.nextInt();
        int s=Binary_Search(a,0,t-1,se); 
        if(s!=-1)
        {
            System.out.println(s);
        }
        else
        {
         s=Binary_Search(a,t,n-1,se);
         System.out.println(s);
        }
    }
}