import java.util.*;
public class time{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s=scan.next();
        String p="";
        int hr=Integer.parseInt(Character.toString(s.charAt(0))+Character.toString(s.charAt(1)));
String min=Character.toString(s.charAt(3))+Character.toString(s.charAt(4));
String sec=Character.toString(s.charAt(6))+Character.toString(s.charAt(7));
String time=Character.toString(s.charAt(8))+Character.toString(s.charAt(9));

if(time.equals("PM")){
    if(hr==12)
    {
         p = Integer.toString(12);

    }
    else
    {
         hr+=12;
         p=Integer.toString(hr);
    }
   
}
else if(time.equals("AM")){
    if(hr==12)
    {
         p="00";
    }
    else{
        p = Integer.toString(hr);
        
    }
   
}
System.out.print(p+":"+min+":"+sec);
    }
}