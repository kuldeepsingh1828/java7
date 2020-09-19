/*
Lembda Expression
*/
interface L
{
	void m(int num); //public abstract void first();
}
class Main
{
	public static void main(String[] args) 
	{
		L obj = (int num)->{	
				System.out.println("Hey I'am a method " + num);
			};	
		obj.m(12);
	}
}