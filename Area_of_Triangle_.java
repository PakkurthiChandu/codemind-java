import java.util.Scanner;
class Codemind
{
    public static void main(String args[])
    {
    int a,b,c;
    float s,n;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    s=(float)(a+b+c)/2;
    n=s*(s-a)*(s-b)*(s-c);
    System.out.printf("%.2f",Math.sqrt(n));
    sc.close();
    }
}