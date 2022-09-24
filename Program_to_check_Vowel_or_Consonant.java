import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char a;
        a=sc.next().charAt(0);
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
        {
            System.out.print("Vowel");
        }
        else
        System.out.print("Consonant");
    }
}