import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b;
        n=sc.nextInt();
        b=(int)Math.sqrt(n);
        if(b*b==n)
        {
            System.out.print("True");
        }
        else
        System.out.print("False");
    }
}