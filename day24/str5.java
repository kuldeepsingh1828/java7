class A
{
	public static void main(String[] args) 
	{
		String a  = "Hi This            is         Kuldeep        ";		//spaces between characters would not be trimmed
		System.out.println(a+ " "+a.length());		
		String b = a.trim().substring(5,12).toUpperCase();
		System.out.println(a+ " "+a.length());		
		System.out.println(a);
		System.out.println(b);
	}	
}
