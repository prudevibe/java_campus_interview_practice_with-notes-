import java.util.*;
public class arm_no
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b=a;
        int rem,res=0;
        while(a!=0)
        {
            rem = a%10;
            res=res+rem*rem*rem;
            a=a/10;
        }
        if(b==res)
        {
            System.out.println(b + "is an armstrong number");
        }
        else
        {
            System.out.println(b + "is not an armstrong number");
        }
    }

}