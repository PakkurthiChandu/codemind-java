import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String b=sc.nextLine();
        String a[]=b.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.printf("%s ",a[i]);
        }
    }
}