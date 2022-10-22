import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>2)
        {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int i=a-1;i>0;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("*");
            }
            System.out.println();
        }
        }
        else
        System.out.println("The pattern is not possible");
    }
}