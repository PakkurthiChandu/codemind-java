import java.util.Scanner;
class Codemind
{
    public static void main(String args[])
    {
    int a,n,c=0,i;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[] arr=new int[n];
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
        if(arr[i]%2!=0)
        {
            c++;
        }
    }
    if(c<=2)
    {
        System.out.println("YES");
    }
    else
    {
        System.out.println("NO");
    }
    }
}