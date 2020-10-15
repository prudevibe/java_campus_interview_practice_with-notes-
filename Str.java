import java.util.*;

/**
 * Str
 */
public class Str {

    public static void main(String[] args) {
        System.out.println("got is tatty\n");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter some int\n");
        int a = scan.nextInt();
        System.out.println(a);
        System.out.println("enter some double\n");
        double b = scan.nextDouble();
        System.out.println(b);
        System.out.println("enter some string");
        String c =scan.nextLine();
        System.out.println(c);
        scan.close();
    }
}