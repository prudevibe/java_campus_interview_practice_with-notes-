import java.util.*;


public class tcs {

   int l,b,h;

   tcs()
   {
        l=3;
        b=4;
        h = 5;
   }
   public int area() {
       return l * b * h;
   }

   public  int perimeter() {
       return l + b + h;
   }

   public static void main(String[] args) {
       tcs op = new tcs();
       System.out.println(op.area());
       System.out.println(op.perimeter());
   }

    
}
