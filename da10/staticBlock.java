class MethodStatic1
{
	static String s1;
	static
	{
		System.out.println("this is the static block 1");
	}
}
class MethodStatic2
{
	static String s2;
	static
	{
		System.out.println("this is the static block 2");
	}
}
class A
{
	public static void main(String[] args) 
	{
		System.out.println(MethodStatic1.s1);
		System.out.println(MethodStatic2.s2);
		System.out.println("this is the main Function statement");
	}
}