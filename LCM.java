import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,a,b,max;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        max=b;
        else
        max=a;
        for(i=max;;i++)
        {
            if(i%a==0 && i%b==0)
            {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }
}