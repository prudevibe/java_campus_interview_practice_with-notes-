import java.util.*;
public class prac_b extends prac_a{

    int d;
    int e;

    prac_b()
    {
        d=12;
        e=14;
    }
    prac_b(int q, int r , int t,int u)
    {
        this.a = q;
        this.b = r;
        this.d = t;
        this.e = u;
    }
    public int add_l()
    {
        return a+b+e+d;
    }
    public static void main(String[] args) {
        prac_b t = new prac_b();
        prac_a v = new prac_b();
        prac_a x = new prac_b(3,5,7,9);
        int rate = 4;
        int year = 5;
        double bl = ((double)rate/100)*year;
        double nRate = rate + bl;
        
        String str = String.format("%2.03f", nRate);
        System.out.println(bl + "is value" + str);

        System.out.println(v.add() +" " + t.add_l() + " " + x.add());
    }


}