//WAP To find the largest element from each row of the 2D array
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
			{100000,2,3,5,6,7,8,9,909,45,67,78,89}
		};
		int largest[] = new int[A.length];
		
		for (int i = 0; i < A.length ; i++ ) 
		{
			largest[i] = A[i][0]; 
			for(int j = 0; j < A[i].length; j++)
			{
				if (A[i][j]>largest[i]) 
				{
					largest[i] = A[i][j]; 	
				}
			}	
		}
		for (int  i= 0; i< largest.length ; i++ ) 
		{
			System.out.println("The Largest element in row "+(i+1)+" : "+largest[i]+" ");	
		}
	}
}