package student;

public class Students {
	public void getStudentInfo(int id)
	{
		System.out.println("Student id is "+id );
	}
	public void getStudentInfo(String name, String email , long phno)
	{
		System.out.println("Student name is " + name);
		System.out.println("Student email is " + email);
		System.out.println("Student phno id " + phno);
	}
public static void main(String[] args) {
	Students details = new Students();
	details.getStudentInfo(183841);
	details.getStudentInfo("Anitha","anitha@02gmail.com",90035287982l);
	
	
}

}
