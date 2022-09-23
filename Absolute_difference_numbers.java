import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c,d,e,r;
        a=sc.nextInt();
        b=sc.nextInt();
        d=(int)Math.log10(a)+1;
        c=a/(int)Math.pow(10,d-b);
        e=a%(int)Math.pow(10,b);
        r=c<e?e-c:c-e;
        System.out.print(r);
        sc.close();
    }
}