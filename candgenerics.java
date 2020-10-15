//collection and generics,itreator,enhanced for loop
import java.util.*;
public class candgenerics{
    public static void main(String[] args)
    {
        //int value[] = new int[];
   //Object values1 = new Object[4];//collection array but size is fixed.
     //   values1[0] = "Navin";
       // values[1]=7;
       Collection values = new ArrayList();
       values.add(3);
       values.add("abhinav");
       values.add(5.8f);
       //Itreator is used to fetch values from Collection<E>.class
       //Iterator i = values.iterator();
       //while(i.hasNext())
       //{
        //System.out.println(i.next());
       //}
       //enhanced for loop 
       for(Object i:values)
       {
        System.out.println(i);
       }
   

    }

}