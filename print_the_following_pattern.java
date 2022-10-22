import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                if(j==i)
                {
                    System.out.printf("0");
                }
                else
                System.out.printf("x");
            }
            System.out.println();
        }
    }
}