interface Abs
{
	 void fun1();
}
interface Abs2 extends Abs
{
	 void fun2();
}
class Main implements Abs2
{
	public void fun1()
	{
		System.out.println("fun1");
	}
	public void fun2()
	{
		System.out.println("fun2");
	}
	public static void main(String[] args) 
	{
			
	}
}