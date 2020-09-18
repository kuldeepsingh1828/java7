import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//datatype array_name[][] = new datatype[rows][cols];
		int A[][] = 
		{
			{1,2,3},
			{4,5,6},
			{7,8,9},
			{56,7,34,3},
			{1,2,3,5,6,7,8,9,909,45,67,78,89}
		}
		;
		System.out.println("The elements of array are below....");
		for (int i = 0; i < A.length ; i++ ) 
		{
			for(int j = 0; j < A[i].length; j++)
			{
				System.out.print(A[i][j]+" ");
			}	
			System.out.println();
		}
	}
}