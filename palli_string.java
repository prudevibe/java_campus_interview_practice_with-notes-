import java .util.*;

class palli_string{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String a = scan.nextLine();
        int c=a.length();
        char b[]=new char[c];
        int j=0;
        for(int i=a.length()-1;i>=0;i--)
        {
           b[j]=a.charAt(i);
           j++; 
        }
        String d= new String(b);
        if(a.equals(d))
        {
            System.out.println("yaaaaaaaaaaaaaaaas");
        }
        else
        {
            System.out.println("Noooooooooooo");
        }

    }
}
