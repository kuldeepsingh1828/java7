import java.util.Scanner;
class Sum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number of elements :\n");
		int size = sc.nextInt();
		int A[] = new int[size];
		for (int i=0; i < size ; i++ ) 
		{
			A[i] = sc.nextInt();
		}
		System.out.println("Entered elements are : ");
		for (int i = 0; i < size ; i++ ) 
		{
			System.out.println(A[i] + " ");	
		}
	}
}