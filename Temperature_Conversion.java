import java.util.Scanner;
class Codemind
{
    public static void main(String args[])
    {
    int a;
    float s;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    s=32+(a*(float)9/5);
    System.out.printf("%.2f",s);
    sc.close();
    }
}