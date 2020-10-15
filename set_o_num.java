import java.util.*;
public class set_o_num
{   
    public static void main(String[] args) {
    
        Scanner new_no = new Scanner(System.in);
        int n = new_no.nextInt();
        int sum = 0;
        System.out.println(n);
        int[] my_arr = new int[n];
        for (int i = 0; i < n; i++) {
            my_arr[i] = new_no.nextInt();
            sum = sum + my_arr[i];
        }
        float avg = sum / n;
        int temp_max = my_arr[0];
        for (int j = 1; j < n; j++) {
            if (my_arr[j] >= temp_max) {
                temp_max = my_arr[j];
            }
        }
        int temp_min = my_arr[0];
        for(int j=1;j<n;j++)
        {
            if(my_arr[j]<=temp_min)
            {
                temp_min=my_arr[j];
            }
        }
        System.out.println("sum is " + sum + "\n");
        System.out.println("avg is " + avg + "\n");
        System.out.println("min is " + temp_min + "\n");
        System.out.println("max is " + temp_max + "\n");
        new_no.close();
    }

}