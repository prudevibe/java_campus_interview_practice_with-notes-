//Set interface use hashset class.the difference between LIST AND SET is set dont support duplicate element.
import java.util.*;
public class setinterface{
    public static void main(String[] args)
    {
        //Set<Integer> values = new HashSet<>();
        Set<Integer> values = new TreeSet<>();
        //treeset will give dATA IN ASCENDINg order.
        values.add(6);
        values.add(8);
        values.add(9);
        //values.add(6) set only support unique no.

        for(int i :values)
        {
            System.out.println(i);
        }
    }
}
