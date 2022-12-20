import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        char ch=sc.nextLine().charAt(0);
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==ch)
            {
                c++;
            }
        }
        if(c==0)
        System.out.println("-1");
        else
        System.out.println(c);
    }
}