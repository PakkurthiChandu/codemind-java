import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
    int n,m,c=0,i;
    n=sc.nextInt();
    m=sc.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        if(a[i]%m!=0)
        {
            c++;
        }
    }
    System.out.println(c);
    }
}