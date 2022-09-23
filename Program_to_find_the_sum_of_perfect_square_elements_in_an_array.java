import java.util.*;
class Codemind
{
    public static boolean perf(int a)
    {
        int b;
        b=(int)Math.sqrt(a);
        if(b*b==a)
        {
            return true;
        }
        return false;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,sum=0;
      n=sc.nextInt();
      int[] a=new int[n];
      for(i=0;i<n;i++)
      {
      a[i]=sc.nextInt();
      if(perf(a[i]))
      {
          sum+=a[i];
      }
      }
      System.out.print(sum);
    }
}