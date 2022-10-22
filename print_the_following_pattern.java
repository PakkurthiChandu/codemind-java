import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=a;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.printf("%d",j);
            }
            System.out.println();
        }
    }
}