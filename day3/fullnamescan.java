import java.util.Scanner;
class Name
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String fullname;
		System.out.println("Enter your full name : ");
		fullname = sc.nextLine(); // to scan full line(including spaces).
		System.out.println("The full name is : " + fullname);
	}
}