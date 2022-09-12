import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,j=0,k=0,l=0;
      n=sc.nextInt();
      int[] a=new int[n];
      int[] b=new int[n];
      int[] c=new int[n];
      for(i=0;i<n;i++)
      a[i]=sc.nextInt();
      for(i=0;i<n;i++)
      {
          if(a[i]%2==0)
          {
             b[j++]=a[i]; 
          }
          else
          {
              c[k++]=a[i];
          }
      }
      i=0;
      while(i<j || l<k)
      {
          if(l<k)
          {
              System.out.printf("%d ",c[i]);
          }
          if(i<j)
          {
              System.out.printf("%d ",b[i]);
          }
          i++;
          l++;
      }
      if(n%2!=0)
      System.out.println("0");
    }
}