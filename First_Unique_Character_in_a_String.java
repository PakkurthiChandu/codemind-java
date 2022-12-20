import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int c=0,i,j;
        for(i=0;i<a.length();i++)
        {
            c=0;
            for(j=0;j<a.length();j++)
            {
                if(a.charAt(i)==a.charAt(j))
                {
                    c++;
                }
            }
            if(c==1)
            {
                c=-1;
                System.out.println(i);
                break;
            }
        }
        if(c!=-1)
        {
            System.out.println("-1");
        }
    }
}