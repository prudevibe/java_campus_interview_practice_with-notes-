import java.util.*;
public class prime
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a =scan.nextInt();
        int cnt=0;
        int rem=0;
        while(a!=0)
        {
            rem = a%10;
            if(rem==1||rem==0)
            {
                System.out.println(rem + "is neither prime nor composite" + "\n");
            }
            else if(rem == 2)
            {
                System.out.println(rem + "is an even prime no"+ "\n");
            }
            else if(rem>2)
            {
                cnt=0;
                for(int i=1;i<=rem;i++)
                {
                    if(rem%i==0)
                    {
                        cnt++;
                    }
                }
                if(cnt==2){
                    System.out.println(rem + "is a prime no");
                }
                
            }
           
            System.out.println(rem);
            a=a/10;
        }
    }

}