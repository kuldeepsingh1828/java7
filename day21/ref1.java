interface A
{
	void ref1(); // public abstract	
}

class Refer
{
	public void referMethod()
	{
		System.out.println("Hey! Iam method of Refer class.");
	}
}

class Main
{
	public static void main(String[] args) 
	{
		Refer refer = new Refer();
		A obj = refer::referMethod;
		obj.ref1();
	}
}