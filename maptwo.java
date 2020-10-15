//to crete phonebook 
//difference between hashmap and hashtable.
/*entery is an interface inside map
Set <Map.Entry<String,String>> values = phonebook.entrySet();
for(Map.Entry<String,String> e:values)
{
    System.out.println(e.getkey() +": "+e.getvalue);
}
*/
import java.util.*;
public class maptwo{
    public static void main(String[] args)
    {
        Map<String,String> phonebook = new HashMap<>();
        phonebook.put("abhi" , "8319");
        phonebook.put("abhin" , "8329");
        phonebook.put("abhina" , "8339");
        phonebook.put("abhinav" , "8349");
        phonebook.put("abh" , "8359");
        Set<String> keys =phonebook.keySet();
        for(String i :keys)
        {
            System.out.println(i +": " +phonebook.get(i));
        }

        
    }
}