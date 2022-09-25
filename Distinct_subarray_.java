import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,s,i,j;
        a=sc.nextInt();
        b=sc.nextInt();
        for(i=a;i<=b;i++)
        {
            s=0;
            for(j=i;j<=b;j++)
            {
                s+=j;
                if(s%2!=0)
                {
                    c++;
                }
            }
        }
        System.out.print(c);
    }
}