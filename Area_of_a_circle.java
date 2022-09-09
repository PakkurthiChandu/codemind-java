import java.util.Scanner;
class Codemind
{
    public static void main(String args[])
    {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    double a=3.14*n*n;
    System.out.printf("%.2f",a);
    sc.close();
    }
}