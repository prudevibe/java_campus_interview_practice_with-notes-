//Map interface has two attributes key and value. 
//muliple values can be same but not keys.
//KeySet() is used to get output in same manner as inserted effect oh hashmap is ignored.
//it can be implemented with hashmap or hashtable,treehashmap,.

import java.util.*;
public class mapone{
    public static void main(String[] args)
    {
        Map<String,String> map = new HashMap<String,String>();
        // we will not get output in sequence because of hashmap
        map.put("my name" , "Abhinav");
        map.put("fav food" , "pasta");
        map.put("ceo" , "anuj");
        System.out.println(map.get("my name"));
        //map.put("fav food","maggie"); // if we repeat key in map then it will replace the previous value.
        Set<String> keys = map.keySet();//to make index in order.
        for(String key:keys)
        {
            System.out.println(key + " " +map.get(key));
        }
        
    }
}