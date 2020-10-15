
/**
 * const
 */
public class conust {
    int l, b, h;

    public int getvolcube() {
        return (l * b * h);
    }

    conust() {
        l = 2;
        b = 7;
        h=10;
        System.out.println("we are in 1st constructor");
    }
    conust( int p,int q,int r)
    {
        p=l;
        q=b;
        r=h;
        System.out.println("we are in 2nd constructor");

    }
    public static void main(String[] args) {
        conust cube1 = new conust();
        conust cube2 = new conust(10,20,30);
        System.out.println("cube1 vol is " + cube1.getvolcube());
        System.out.println("cube2 vol is " + cube2.getvolcube());
    
    
    }
    
}
   
