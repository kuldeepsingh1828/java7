import java.util.Scanner;
class Student
{
	private int id;
	private String name;
	public Student()
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
		System.out.println("Enter the id : ");
		id = sc.nextInt();
	}
	public Student(String name, int id) // Constructor
	{
		this.name = name;	
		this.id = id;	
	}
	void Display() // function to display data
	{
		System.out.println("Name : "+name);
		System.out.println("ID   : "+id);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student("Dewansh",1); // parameterized
		Student s2 = new Student(); //default
		s1.Display();	
		s2.Display();	

	}
}