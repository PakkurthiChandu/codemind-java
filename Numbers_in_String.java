import java.util.*;
class Codmind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int i,sum=0;
        for(i=0;i<a.length();i++)
        {
            if(a.charAt(i)>='0' && a.charAt(i)<='9')
            {
                sum+=Integer.parseInt(a.charAt(i)+"");
            }
        }
        System.out.println(sum);
        sc.close();
    }
}