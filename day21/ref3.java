interface A
{
	void ref1(); // public abstract	
}

class Refer
{
	public Refer()
	{
		System.out.println("Hey! Iam method of Refer class.");
	}
}

class Main
{
	public static void main(String[] args) 
	{
		A obj = Refer::new; // class_name :: new ;
		obj.ref1();
	}
}