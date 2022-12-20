import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int[] b=new int[27];
        int c,max=-9999,max1=-99999;
        for(int i=0;i<a.length();i++)
        {
             c=a.charAt(i)-'a'+1;
             b[c]++;
            //System.out.println(c);
            if(b[c]>max)
            {
                max=b[c];
            }
            
        }
        if(max<=1)
        {
            System.out.println("-1");
        }
        else
        {
        int t=0;
        for(int i=1;i<26;i++)
        {
            if(b[i]!=max && b[i]>max1)
            {
                max1=b[i];
                t=i;
            }
        }
        System.out.printf("%c",t+96);
        }
    }
}