import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(true)
        {
            if(n%2==0)
            {
                n=n/2;
            }
            else if(n%3==0)
            {
                n=n/3;
            }
            else if(n%5==0)
            {
                n=n/5;
            }
            else
            {
                break;
            }
        }
        if(n==1)
        {
            System.out.print("Ugly Number");
        }
        else
        {
            System.out.print("Not Ugly Number");
        }
        
    }
}