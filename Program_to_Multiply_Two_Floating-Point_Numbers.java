import java.util.Scanner;
class Codemind
{
    public static void main(String args[])
    {
    double a,b;
    Scanner sc=new Scanner(System.in);
    a=sc.nextFloat();
    b=sc.nextFloat();
    System.out.printf("%.2f",a*b);
    sc.close();
    }
}