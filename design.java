import java.util.*;
public class design
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        for(int i=0;i<a;i++)
        {
            int b= a+(a-1);
            for(int j=0;j<b;j++)
            {
               if(j>=0 && j<=a-1)
               {
                   System.out.print(" ");
               }
               else{
                   System.out.print("*");
               }
            }
            b--;
            System.out.println("\n");
        }

    }

}