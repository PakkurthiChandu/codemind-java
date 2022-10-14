import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.nextLine();
        int i;
        for(i=a.length()-1;i>=0;i--)
        {
            System.out.printf("%c",a.charAt(i));
        }
    }
}