// code to sort student marks in class without using comperator and lambda expression.
import java.util.*;
public class listcom{
    public static void main(String[] args)
    {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1,55));
        studs.add(new Student(2,95));
        studs.add(new Student(3,35));
        studs.add(new Student(4,45));
        studs.add(new Student(5,85));
        for(Student s : studs)
        {
            System.out.println(s);
        }

    }
}
class Student implements Comparable<Student>{
    int rollno;
    int marks;
    public Student(int rollno,int marks)
    {
        this.rollno =rollno;
        this.marks = marks;
    }

    
    public String toString(){
        return "Student{" + "rollno=" + rollno + ",marks=" + marks + '}';
    }
    public int compareTo(Student s){
        return this.marks>s.marks?-1:this.marks<s.marks?1:0;
    }
}