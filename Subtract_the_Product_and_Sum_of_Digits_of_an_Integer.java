import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,s=0,b,p=1;
        a=sc.nextInt();
        while(a!=0)
        {
            b=a%10;
            a=a/10;
            p*=b;
            s+=b;
        }
        System.out.println(p-s);
        sc.close();
    }
}