class A
{
	public static void main(String[] args) 
	{
		String url = "http://localhost:3306/mysql";
		String sub = url.substring(4);
		System.out.println(sub);	
		sub = url.substring(4,10);
		System.out.println(sub);	
	}
}