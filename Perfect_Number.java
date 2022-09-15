import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,i,s=0;
        a=sc.nextInt();
        for(i=1;i<=a/2;i++)
        {
            if(a%i==0)
            {
                s+=i;
            }
        }
        if(s==a)
        System.out.printf("True");
        else
        System.out.printf("False");
        sc.close();
    }
}