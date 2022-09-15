import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c,s=0;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            if(i%c==0)
            {
                s++;
            }
        }
        System.out.printf("%d",s);
        sc.close();
}
}