import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt(),i,j;
        for(i=a;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.printf("%c ",64+i);
            }
            System.out.println();
        }
    }
}