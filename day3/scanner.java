import java.util.Scanner;
class A
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		float b;
		char c;
		double d;
		long l;
		boolean bool;
		byte by;
		String s;
		short sh;
		System.out.println("Enter a number (byte) : ");
		by = sc.nextByte();
		System.out.println("Enter a number (short) : ");
		sh = sc.nextShort();
		System.out.println("Enter a number (int) : ");
		a = sc.nextInt();
		System.out.println("Enter a number (long) : ");
		l = sc.nextLong();
		System.out.println("Enter a Float (Float) : ");
		b = sc.nextFloat();
		System.out.println("Enter a Float (Double) : ");
		d = sc.nextDouble();
	//	System.out.println("Enter a String (char) : ");
	//	c = sc.nextChar();
		System.out.println("Enter a String (String) : ");
		s = sc.next();
		System.out.println("Enter a Boolean (boolean) : ");
		bool = sc.nextBoolean();
		System.out.println("Byte : "+by);
		System.out.println("Short : "+sh);
		System.out.println("Integer : "+a);
		System.out.println("Long : "+l);
		System.out.println("float : "+b);
		System.out.println("Double : "+d);
		System.out.println("String : "+s);
		System.out.println("Boolean : "+bool);
	}
}