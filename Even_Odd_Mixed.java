import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,e=0,o=0;
        a=sc.nextInt();
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            if(b%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
        }
        if(e==0&&o!=0)
        {
            System.out.println("Odd");
        }
        else if(e!=0&&o==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Mixed");
        }
        sc.close();
    }
}