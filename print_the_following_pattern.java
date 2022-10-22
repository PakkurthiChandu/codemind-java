import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),i,j;
        for(i=1;i<=a;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.printf("%d",j);
            }
            System.out.println();
        }
    }
}