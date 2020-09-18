class A
{
	void sum(int a, int b)
	{
		int s = a+b;
		System.out.println(s);
	}
	void sum(int a, float b)
	{
		float s = a+b;
		System.out.println(s);		
	}
	void sum(float a, int b)
	{
		float s = a+b;
		System.out.println(s);
	}
	public static void main(String[] args) {
		A o = new A();
		o.sum(12,12);
		o.sum(12,112.3f);
		o.sum(16.2f,12);
	}
}