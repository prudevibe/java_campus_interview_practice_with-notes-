// list interface :-to add no between two no.
import java.util.List;
import java.util.*;
public class listinter
{
    public static void main(String[] args)
    {
        
        List<Integer> values = new ArrayList<Integer>();
        values.add(4);
        values.add(5);
        values.add(9);
        values.add(1,3);//add with index.
        //sorting
        Collections.sort(values);
        for(int i:values)
        {
            System.out.println(i);
        }
    }
}