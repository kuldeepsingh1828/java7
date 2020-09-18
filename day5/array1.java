import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		//datatype variableName [] = new datatype[size];
		int A[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i< 10 ; i++ ) 
		{
			A[i] = sc.nextInt();	
		}
		for (int i = 0; i < 10 ; i++ ) 
		{
			System.out.print(A[i] + " ");	
		}
	}
}