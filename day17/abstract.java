abstract class Shape
{
	int area;
	abstract void Area(); // METHOD THAT DON't HAVE BODY
}
class Square extends Shape
{
	int s;
	void Area()
	{
		System.out.println("Area of Square  is : "+(s*s));
	}
}
class Rectangle extends Shape
{
	int l,b;
	void Area()
	{
		System.out.println("Area of Rectangle  is : "+(l*b));
	}
}
class Main
{

	public static void main(String[] args) 
	{
		Square square = new Square();
		Rectangle rect = new Rectangle();
		square.s = 4;
		rect.l = 4;
		rect.b = 6;
		square.Area();
		rect.Area();
	}
}