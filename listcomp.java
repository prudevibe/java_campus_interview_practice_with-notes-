// code to sort student marks in class using comperator and lambda expression.
import java.util.*;
public class listcomp{
    public static void main(String[] args)
    {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student(1,55));
        studs.add(new Student(2,95));
        studs.add(new Student(3,35));
        studs.add(new Student(4,45));
        studs.add(new Student(5,85));
        Collections.sort(studs , (s1,s2) ->{
            return s1.marks>s2.marks?-1:s1.marks<s2.marks?1:0;
        });
        for(Student s : studs)
        {
            System.out.println(s);
        }

    }
}
class Student{
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
}