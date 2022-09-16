import java.util.*;
class Codemind
{
    static int prime(int a)
    {
        if(a==1)
        return 0;
        int i;
        for(i=2;i*i<=a;i++)
        {
            if(a%i==0)
            return 0;
        }
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,k,j,a;
            a=sc.nextInt();
            for(j=a;;j++)
            {
                if(prime(j)==1)
                break;
            }
            for(k=a;;k--)
            {
                if(prime(k)==1)
                break;
            }
            if((j-a)>=(a-k))
            {
                System.out.println(a-k);
            }
            else
            {
                System.out.println(j-a);
            }
        sc.close();
    }
}