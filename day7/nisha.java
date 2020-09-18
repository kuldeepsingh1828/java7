import java.util.Scanner;
class A
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of row :");
		int row=s.nextInt();
		System.out.println("enter the number of column :");
		int column=s.nextInt();
		int A[][]=new int[row][column];
		System.out.println(" enter the element of the array :");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				
				A[i][j]=s.nextInt();
				
				
			}
			
			
		}
		System.out.println();
		for(int i=0;i<row;i++)
		 {
			  for(int j=0;j<column;j++)
	       {	  
		     // System.out.println(A[i][j]+" ");
			 if(A[i][j]%2==0)
			 {
				System.out.println("even="+A[i][j]); 
			 }
			 else
			 {
				 System.out.println("odd="+A[i][j]);
			 }
			 
			 
		   }
		   System.out.println();
		 }
		
		
	}
	}