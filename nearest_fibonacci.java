import java.util.*;
class Codemind{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a;
        a=sc.nextInt();
        int f=0,s=1,m;
        while(s<a)
        {
            m=f+s;
            f=s;
            s=m;
        }
        if((s-a)==(a-f))
        {
            System.out.printf("%d %d",f,s);
        }
        else if((s-a)<(a-f))
        {
            System.out.printf("%d",s);
        }
        else
        {
            System.out.println(f);
        }
    }
}
