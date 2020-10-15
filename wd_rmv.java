import java.util.*;

class wd_rmv{
    public static void removeword(char c,String s)
    {
        int i;
        char b[] = s.toCharArray(); 
        for(i=0;i<=s.length();i++)
        {
            if(c==s.charAt(i))
            {
                for(int j=0;j<s.length()-(i+1);j++)
                {
                    b[j]=b[j+1];
                }
            }
        }
       System.out.println(b);
    }
    public static void main(String[] args) {
        removeword('s',"sanjdkbfsbkbf");
    }
}