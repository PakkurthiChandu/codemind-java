import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,max=0;
        a=sc.nextInt();
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            if(b>max)
            max=b;
        }
        System.out.printf("%d",max);
    }
}