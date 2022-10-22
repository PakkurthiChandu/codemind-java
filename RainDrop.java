import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%3==0)
        {
            System.out.printf("Pling");
        }
        if(a%5==0)
        {
            System.out.printf("Plang");
        }
        if(a%7==0)
        {
            System.out.printf("Plong");
        }
        if(a%3!=0 && a%5!=0 && a%7!=0)
        {
            System.out.printf("%d",a);
        }
    }
}