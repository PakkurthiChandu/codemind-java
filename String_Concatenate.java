import java.util.*;
class Codmind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine(),b;
        b=sc.nextLine();
        a=a+b;
        char[] c=a.toCharArray();
        Arrays.sort(c);
        System.out.println(c);
        sc.close();
    }
}