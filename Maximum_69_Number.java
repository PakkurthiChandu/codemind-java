import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,r=0,rev=0,c=0;
        a=sc.nextInt();
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            r=r*10+b;
        }
        while(r!=0)
        {
            b=r%10;
            r=r/10;
            if(c==0&&b==6)
            {
            rev=rev*10+9;
            c++;
            }
            else
            rev=rev*10+b;
        }
        System.out.println(rev);
        sc.close();
    }
}