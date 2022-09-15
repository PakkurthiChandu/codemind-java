import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,s=0,p=1;
        a=sc.nextInt();
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            s+=b;
            p*=b;
        }
        if(s==p)
        {
            System.out.printf("Spy Number");
        }
        else
        {
            System.out.printf("Not Spy Number");
        }
        sc.close();
    }
}