/**
 * stud
 */
public class stud {

    int id;
    String name;
    int age;
    public static void main(String[] args) {
        stud student1 = new stud();
        student1.id=1;
        student1.name="abhinav";
        student1.age=22;
        System.out.println(student1.name+"is"+student1.age+"years old");
        stud student2 =new stud();
        student2.id=2;
        student2.name="aakash";
        student2.age=21;
        System.out.println(student2.name+"is"+student2.age+"years old");

    }
}