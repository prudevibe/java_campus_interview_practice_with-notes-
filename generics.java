import java.util.*;
class container<T> //T=type
{
    T value; //T can be int,string.
    public T  getValue()
    {
        return value;
    }
    public void show()
    {
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<Integer> obj)
    {

    }
}
public class generics
{
    public static void main(String[] args)
    {
        //List values = new ArrayList<>();//it can have any data type so no type safety.
        container<Integer> obj = new container<>();//it can be any datatype in place of int.

        obj.demo(new ArrayList<Integer>() );
    }
}