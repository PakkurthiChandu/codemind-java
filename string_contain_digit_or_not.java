import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.nextLine();
        int i,c=0;
        for(i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch>='0'&&ch<='9')
            {
                c++;
            }
        }
        if(c==0)
        {
            System.out.println("Doesn't contain digit");
        }
        else
        {
            System.out.println("Contains "+c+" digit");
        }
    }
}