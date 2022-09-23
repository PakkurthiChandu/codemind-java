import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,min=999999999,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            min=a;
        }
        else
        min=b;
        for(i=min;i>=1;i--)
        {
            if(a%i==0&&b%i==0)
            {
                System.out.print(i);
                break;
            }
        }
    }
}