interface A
{
	void ref1(); // public abstract	
}

class Refer
{
	public static void referMethod()
	{
		System.out.println("Hey! Iam method of Refer class.");
	}
}

class Main
{
	public static void main(String[] args) 
	{
		A obj = Refer::referMethod; // class_name :: methodname ;
		obj.ref1();
	}
}