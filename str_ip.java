import java.util.*;/**
 * str_ip
 */
public class str_ip {

    public static void main(String[] args) {
        java.util.Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        System.out.println(a.length());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        System.out.println((a+b).length());
        System.out.println("hello " + a + b + "," +"good bye");
        System.out.println(a.replace('a', 'e'));
        scan.close();

    }
}