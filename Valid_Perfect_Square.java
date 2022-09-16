import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0,j,a;
        n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            c=0;
            a=sc.nextInt();
            for(j=1;j<=a;j++)
            {
                if(j*j==a)
                {
                    System.out.println("True");
                    c++;
                    break;
                }
                if(j*j>a)
                break;
            }
            if(c==0)
            System.out.println("False");
        }
        sc.close();
    }
}