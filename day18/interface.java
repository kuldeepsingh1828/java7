interface Shape // 100% abstraction
{
	 void Area();
	 void getName();
	 void perimeter(); // abstract
}
class Square implements Shape
{
	int s;
	public void Area()
	{
		System.out.println(s*s);
	}
	public void perimeter()
	{
		System.out.println(4*s);
	}
}
class Main
{
	public static void main(String[] args) 
	{
		Square square = new Square();
		square.s = 4;
		square.Area();
		square.perimeter();
	}
}