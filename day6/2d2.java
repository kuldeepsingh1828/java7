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
			{4,5,64},
			{17,8,9}
		};
		System.out.println("The elements of array are below....");
		for (int i = 0; i < 3 ; i++ ) 
		{
			for(int j = 0; j < 3; j++)
			{
				System.out.print(A[i][j]+" ");
			}	
			System.out.println();
		}
	}
}