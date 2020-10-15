import java.util.*;
import java.util.Stack;
public class balan_pare{

    static boolean ismatch(char char1,char char2)
    {
        if(char1=='(' && char2==')')
        {
            return true;
        }
        else if (char1 == '{' && char2 == '}') 
         return true; 
       else if (char1 == '[' && char2 == ']') 
         return true; 
       else
         return false;
    }
    static boolean areparabalan(char exp[])
    {
        Stack st = new Stack();
        for(int i=0;i<exp.length;i++)
        {
            if(exp[i]=='{'|| exp[i]=='(' || exp[i]=='[')
            {
                st.push(exp[i]);
            }
            if(exp[i] == '}' || exp[i] == ')' || exp[i] == ']')
            {
               if(st.isEmpty())
               {
                   return false;
               } 
               else if(!ismatch(st.pop(), exp[i]))
               {
                   return false;
               }
            }
            if(st.isEmpty())
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        char exp[] = {'{','(',')','}','[',']'}; 
          if (areparabalan(exp)) 
            System.out.println("Balanced "); 
          else
            System.out.println("Not Balanced "); 
        
    }
    

}