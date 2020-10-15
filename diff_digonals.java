import java.util.*;
public class diff_digonals{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner d = new Scanner(System.in);
        int c= scan.nextInt();
        int r= scan.nextInt();
        System.out.println(c + r);
        int[][] arr = new int[c][r];
        int sum1=0,i,j;
        int sum2=0;
        for (i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                arr[i][j]=d.nextInt();
            }
            
        }
        for (i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
            
        }
        for(i=0;i<c;i++)
        {
            for(j=0;j<r;j++)
            {
                if(i==j)
                {
                    sum1 = sum1 + arr[i][j];
                }
            }

        }
        for(i=0 ; i<c;i++)
        {
            for(j=r-1;j>=0;j--)
            {   
                sum2=sum2+arr[i][j];
                r--;
                break;
                
            }
        }
        System.out.println(sum1);
        System.out.println(sum2);
    }

}