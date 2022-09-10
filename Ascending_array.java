import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,i;
        a=sc.nextInt();
        int[] arr=new int[a];
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<a-1;i++)
        {
            if(arr[i]>=arr[i+1])
            {
                c++;
                break;
            }
        }
        if(c==0)
        System.out.println("yes");
        else
        System.out.println("no");
        sc.close();
    }
}