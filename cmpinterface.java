// compare interface in java
import java.util.*;
class Comipl implements Comparator<Integer>
{
    public int compare(Integer a,Integer b)
    {
        /*normal sorting 
        if(a>b)
        {
            return 1;
        }
        else{
            return -1;
        }*/
        //sorting with the help of last digit.
        if(a%10>b%10)
        {
            return 1;
        }
        return -1;
    }
}
public class cmpinterface{
    public static void main(String[] args)
    {
        List<Integer> values = new ArrayList<Integer>();
        values.add(305);
        values.add(998);
        values.add(774);
        values.add(236);
        values.add(881);
        // to change logic of sorting technique.
        Comparator<Integer> com = new Comipl();
        Collections.sort(values,com);
        //Collections.sort(values);
        //Collections.reverse(values);
        for(int i :values)
        {
            System.out.println(i);
        }
    }
}