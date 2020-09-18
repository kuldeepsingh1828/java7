//variable can be accessed without objects of the class.
class Static 
{
	static int id;
	String name;
	double marks;
}
class A
{
	public static void main(String[] args) 
	{
		Static.id = 23; // without creating object we can access data members. //23
		Static s1 = new Static();
		Static s2 = new Static();
		s1. id = 345; // 345
		System.out.println(s1.id); //345
		s2. id = 345; // 345
		System.out.println(s2.id); //345
		s1.id =  120; //120
		s2.id =  125; //125
		System.out.println(Static.id); // 125
	}
}