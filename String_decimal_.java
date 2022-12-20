import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,t;sc.nextLine();
        String a;
        for(i=0;i<n;i++)
        {
            a=sc.nextLine();
            t=0;
            for(int j=0;j<a.length();j++)
            {
                if(a.charAt(j)<'0' || a.charAt(j)>'9')
                {
                    System.out.println("False");
                    t=1;
                    break;
                }
            }
            if(t==0)
            {
                System.out.println("True");
            }
        }
        
    }
}