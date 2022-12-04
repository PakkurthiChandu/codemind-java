import java.util.*;
class Codmeind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a;
        a=sc.nextLine();
        if(a.length()==10 && a.charAt(0)!=0)
        {
            System.out.println("Valid");
        }
        else
        {
            System.out.println("Invalid");
        }
    }
}