import java.util.*;
class str_res
{
    public static int str_op(char s[])
    {
        return s.length;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char a[]={'a','b','c','d','e'};
        String st=new String(a);
        System.out.println(str_op(a));
        System.out.println(st);
    }
}