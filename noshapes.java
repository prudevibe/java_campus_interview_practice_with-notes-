import java.util.*;
public class noshapes{
public static void main(String[] args) {
    class Number{
        int n;

        public boolean isSquare(){
            double sq =Math.sqrt(n);
            if(sq == Math.floor(sq))
            {
                return true;
            }
            else{
                return false;
            }
        }
        public boolean isTriangular()
        {
            int x = 1;
            int trino = 1;
            while(trino < n)
            {
                x++;
                trino = trino + x ;
            }
            if(trino == n)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
    }
    Number newno = new Number();
        newno.n=9;
        System.out.println(newno.isSquare());
}
}