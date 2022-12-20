import java.util.*;
class Codemind
{
    public static boolean pal(String a)
    {
        int i=0,j=a.length()-1;
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i;
        sc.nextLine();
        String a;
        for(i=0;i<n;i++)
        {
            a=sc.nextLine();
            if(pal(a))
            {
                if(a.length()%2==0)
                {
                    System.out.println("YES EVEN");
                }
                else
                {
                    System.out.println("YES ODD");
                }
            }
            else
            System.out.println("NO");
        }
    }
}