
/**
 * over
 */
public class over {

    public static int add(int a,int b)
    {
        return (a+b);
    }
    public static String add(String a,String b)
    {
        return(a+b);
    }
    public static void main(String[] args) {
        int c;
        String d;
        c=add(10,20);
        d=add("rohan","ronit");
        System.out.println("sum of two no is" + c);
        System.out.println("sum of two string is" + d);
    

    }
}