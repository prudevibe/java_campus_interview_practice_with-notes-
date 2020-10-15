import java.util.*;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<5;i++)
        {
            st.push(i+5);
        }
        System.out.println(st.peek() + " " + st.capacity() + " "+ st.search(5));
    }
    
}