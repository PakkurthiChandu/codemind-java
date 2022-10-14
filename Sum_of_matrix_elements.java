import java.util.*;
class Codemind
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,c,i,j,sum=0;
        r=sc.nextInt();
        c=sc.nextInt();
        int[][] a=new int[r][c];
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
            }
        }
        System.out.println(sum);
    }
}