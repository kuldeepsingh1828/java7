import java.util.Scanner;
class A
{
	public static void main(String[] args) 
	{
		int e=0,o=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of rows : ");
		int r = sc.nextInt();
		System.out.println("Enter Number of cols : ");
		int c = sc.nextInt();
		int A[][]  = new int[r][c];
		System.out.println("enter "+r+" X "+c+" array");
		for (int i = 0; i < r ; i++ ) 
		{
			for (int j = 0; j < c ; j++) 
			{
				A[i][j] = sc.nextInt();	
				if(A[i][j]%2==0)
				{
					e++;
				}
				else
				{
					o++;
				}
			}	
		}
		int even[] = new int[e];
		int odd[] = new int[o];
		e = 0;
		o = 0;
		for (int i = 0; i < r ; i++ ) 
		{
			for (int j = 0; j < c ; j++) 
			{
				if(A[i][j]%2==0)
				{
					even[e++] = A[i][j]; 
				}
				else
				{
					odd[o++] = A[i][j];
				}
			}	
		}
		System.out.print("EVEN : ");
		for (int i = 0; i < even.length ; i++ ) 
		{
			System.out.print(even[i]+ " ");	
		}
		System.out.println();
		System.out.print("ODD : ");
		for (int i = 0; i < odd.length ; i++ ) 
		{
			System.out.print(odd[i]+ " ");	
		}
		System.out.println();
	}
}