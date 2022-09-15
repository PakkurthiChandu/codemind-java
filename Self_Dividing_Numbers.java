import java.util.*;
class Codemind
{
    static int se(int a)
    {
        int b=a,c;
        while(a!=0)
        {
            c=a%10;
            a=a/10;
            if(c==0||b%c!=0)
            {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(se(i)==1)
            {
                System.out.printf("%d ",i);
            }
        }
        sc.close();
}
}