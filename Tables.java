import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i=1;
        a=sc.nextInt();
        b=sc.nextInt();
        while(i<=b)
        {
            System.out.printf("%d x %d = %d
",a,i,a*i);
            i+=2;
        }
        sc.close();
    }
}