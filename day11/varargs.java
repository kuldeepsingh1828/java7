class  A
{
	void method(int... i) //MAKE SURE 3 dots only.
	{
		System.out.println("This method has " + i.length + " paramter");
	}
	public static void main(String[] args) 
	{
		A   o = new A();
		o.method(1);
		o.method(3135,467,7,7,54,64);
		o.method(1,45,89,23,79,34,78,34,5,34,4,5,53,5,5,65,6,56,5,77,87,86);
	}
}