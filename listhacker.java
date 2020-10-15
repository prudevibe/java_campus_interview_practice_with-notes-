import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class listhacker {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter list limit N");
        int N = sc.nextInt();
        List<Integer> lst = new ArrayList<Integer>();
        System.out.println("add element to list");
        for(int i=0;i<N;i++)
        {
            lst.add(sc.nextInt());
        }
        System.out.println("enter no of queries");
        int noOfQueries = sc.nextInt();
        sc.nextLine();
        while(noOfQueries>0)
        {
            System.out.println("enter Insert or delete");
            String addNew = sc.nextLine();
            if(addNew.equals("Insert"))
            {
                System.out.println("enter pos and new value");
                int pos = sc.nextInt();
                int newValue = sc.nextInt();
                sc.nextLine();
                lst.add(pos,newValue);
                System.out.println(lst);
            }
            else if(addNew.equals("Delete"))
            {
                System.out.println("enter pos to delete");
                int posToDelete = sc.nextInt();
                sc.nextLine();
                lst.remove(posToDelete);
                System.out.println(lst);
            }
            noOfQueries--;
        }
        ListIterator itr = lst.listIterator();
        while(itr.hasNext())
        {
            int i = (Integer)itr.next(); 
  
            // getting even elements one by one 
            System.out.print(i + " "); 
        }
        sc.close();
    }
}