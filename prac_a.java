import java.util.*;

public class prac_a {

    public int a;
    protected int b;
    private int c;

    prac_a()
    {
        a=10;
        b=20;
        c=30;
    }
    prac_a(int h,int k,int n)
    {
        this.a = h;
        this.b = k;
        this.c = n;
    }
    public int add()
    {
        return a+b+c;
    }

    
    public static void main(String[] args) {

        prac_a t = new prac_a();
        System.out.println(t.a +" "+ t.b +" " + t.c + "sum is" +t.add());
        prac_a g = new prac_a(2,3,4);
        System.out.println(g.a +" " + g.b + " "+ g.c + "sum is" +g.add());
    }

}