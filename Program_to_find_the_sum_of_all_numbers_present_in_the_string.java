import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int sum=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch>='0' && ch<='9')
            {
                sum+=(int)a.charAt(i)-'0';
            }
        }
        System.out.println(sum);
    }
}