/**
 * stucnt
 */
public class stucnt {

	String name;
	int age;
	static int NoOfStudents =0; // static variable can be called by class itself.
	stucnt()//constructor
	{
		NoOfStudents++;
	}
	public static int getnoofstudents()
	{
		return NoOfStudents;
    }
    public static void main(String[] args)
{
	stucnt mark=new stucnt();
	stucnt tom = new stucnt();
	System.out.println(stucnt.getnoofstudents());//static called by class name itself.
}
}

