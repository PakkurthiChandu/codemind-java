import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
    int n,m,c=0,i;
    n=sc.nextInt();
    int[] a=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
        if(a[i]==0)
        {
            c++;
        }
    }
    i=0;
    while(i<c)
    {
        System.out.printf("0 ");
        i++;
    }
    while(i<n)
    {
        System.out.printf("1 ");
        i++;
    }
    }
}