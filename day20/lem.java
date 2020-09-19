/*
Lembda Expression
*/
interface L
{
	void scnd(); //public abstract void first();
}
class Main
{
	public static void main(String[] args) 
	{
		L obj = ()->{	
				System.out.println("Hey I'am a method");
			};	
		obj.scnd();
	}
}
