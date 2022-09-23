import java.util.*;
class Codemind
{
    public static boolean pal(int a)
    {
        int d,b,c;
        d=(int)Math.log10(a);
        while(a!=0)
        {
            b=a/(int)Math.pow(10,d);
            c=a%10;
            if(b!=c)
            {
                return false;
            }
            a=a%(int)Math.pow(10,d);
            a=a/10;
            d-=2;
        }
        return true;
    }
   
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,j;
        a=sc.nextInt();
        for(i=a+1;;i++)
        {
            if(pal(i))
            break;
        }
        for(j=a-1;;j--)
        {
            if(pal(j))
            break;
        }
        if((a-j)==(i-a))
        {
            System.out.printf("%d %d",j,i);
        }
        else if((a-j)<(i-a))
        {
            System.out.print(j);
        }
        else
        {
            System.out.print(i);
        }
        sc.close();
    }
}