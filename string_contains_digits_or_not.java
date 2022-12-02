import java.util.*;
class Codmind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c;
        sc.nextLine();
        String a;
        for(int i=0;i<n;i++)
        {
            a=sc.nextLine();
            c=0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)>='0' && a.charAt(j)<='9')
                {
                    c=1;
                    System.out.println("Yes");
                    break;
                }
            }
            if(c==0)
            System.out.println("No");
        }
    }
}