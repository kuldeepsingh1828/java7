import java.util.Scanner;
class CharScan
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character : ");
		char c = sc.next().charAt(0);
		System.out.println("Character is : "+c);
	}
}