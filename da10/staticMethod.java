class MethodStatic
{
	static void method() // Method 1
	{
		System.out.println("this is static method...");
	}
}
class A
{
	public static void main(String[] args) 
	{
		MethodStatic m = new MethodStatic();
		m.method();// calling method using object of the class.
		MethodStatic.method();	 // calling method using class name.
	}
}