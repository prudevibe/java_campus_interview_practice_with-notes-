import java.util.*;

/**
 * condi
 */


public class array_ip {

    public static void main(String[] args) {
        int[] myarray = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            myarray[i]= scan.nextInt();
            System.out.println("the array elements are"+ myarray[i]);
        }
        scan.close();

    }
}