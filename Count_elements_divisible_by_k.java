import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,i;
        a=sc.nextInt();
        b=sc.nextInt();
        int[] arr=new int[a];
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a;i++)
        {
            if(arr[i]%b==0)
            {
                c++;
            }
        }
        System.out.println(c);
        sc.close();
    }
}