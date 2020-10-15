import java.util.*;
public class digi_cnt{
    public static void main(String[] args) {
        Scanner new_no = new Scanner(System.in);
        int a= new_no.nextInt();
        int rem =0;
        int sum=0;
        int rev_num=0;
        while (a!=0)
        {
            rem = a%10;
            a=a/10;
            sum = sum + rem;
            rev_num = (rev_num +rem)*10;
            
        }
        System.out.println(rev_num);
        System.out.println(rem + "sum is " + sum);
        rev_num=rev_num/10;
        System.out.println(rev_num);
        while(rev_num!=0)
        {
            int rem1 = rev_num%10;
            rev_num=rev_num/10;
            System.out.println(rem1);
        }
    }   
}
