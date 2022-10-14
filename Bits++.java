import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        sc.nextLine();
        String a;
        int c=0;
        for(int i=0;i<n;i++)
        {
            a=sc.nextLine();
            if(a.charAt(1)=='+')
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        System.out.println(c);
    }
}