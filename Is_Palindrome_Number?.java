import java.util.*;
class Codemind
{
    static int pal(int a){
        int b,c=a,r=0;
        while(a!=0)
        {
            b=a%10;
            a=a/10;r=r*10+b;
        }
        if(r==c)
        {
            return 2;
        }
        else
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(pal(a));
    }
}
