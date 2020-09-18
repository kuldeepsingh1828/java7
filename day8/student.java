import java.util.Scanner;
class Student
{
	private int id;
	private String name;
	public Student() // Constructor
	{
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name = sc.nextLine();
		System.out.println("Enter the id : ");
		id = sc.nextInt();
	}
	void Display() // function to display data
	{
		System.out.println("Name : "+name);
		System.out.println("ID   : "+id);
	}
	public static void main(String[] args) 
	{
		Student s = new Student();
		s.Display();	
	}
}