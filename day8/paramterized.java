import java.util.Scanner;
class Student
{
	private int id;
	private String name;
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
		Student s = new Student("Dewansh",1);
		s.Display();	
	}
}