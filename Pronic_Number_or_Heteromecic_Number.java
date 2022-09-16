import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,c=0,i;
        a=sc.nextInt();
        for(i=1;i*(i+1)<=a;i++)
        {
            if(i*(i+1)==a)
            {
                c++;
                System.out.println("YES");
            }
        }
        if(c==0)
        System.out.println("NO");
        sc.close();
    }
}