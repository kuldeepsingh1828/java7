
/*
functional interface
default method
static method
lembda expression
method refrencing
*/

//AN INTERFACE THAT HAVE ONLY 1 abstract method is known as functional interface.

@FunctionalInterface
interface A
{
	abstract void fun1();
	default void D()
	{
		System.out.println("Default method of Interface");
	}
}
class Main implements A
{
	public void fun1()
	{
		System.out.println("Fun1");
	}
	public void D()
	{
		System.out.println("D override");
	}
	public static void main(String[] args) 
	{
			Main m = new Main();
			m.fun1();
			m.D();
	}
}
