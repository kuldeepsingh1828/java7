class Vehicle
{
	private String engine;
	private boolean break;
}
Class Bike extends Vehicle
{
	private boolean hasGear = false;
	private boolean roundHandle = false;
}
Class Car extends Vehicle
{
	private boolean hasGear = true;
	private boolean roundHandle = true;
}
Class Main
{
	public static void main(String[] args) 
	{
		Bike bike = new Bike();	
		Car car = new Car();	
	}
}