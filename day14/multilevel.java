class Teacher
{
	private int id = 1231;
	private String name = "Prem Lata";
	private String college="MIT College";
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
	
}
class CSETeacher extends Teacher
{
	private boolean hasLaptop = true;
	private boolean takeOnlineClasses = true;

    public boolean isHasLaptop() {
        return hasLaptop;
    }

    public void setHasLaptop(boolean hasLaptop) {
        this.hasLaptop = hasLaptop;
    }

    public boolean isTakeOnlineClasses() {
        return takeOnlineClasses;
    }

    public void setTakeOnlineClasses(boolean takeOnlineClasses) {
        this.takeOnlineClasses = takeOnlineClasses;
    }
}
class HOD extends CSETeacher
{
	private String cabinNum = "212";
	private int NumberOfStaff =  12;
    
    public String getCabinNum() {
        return cabinNum;
    }

    public void setCabinNum(String cabinNum) {
        this.cabinNum = cabinNum;
    }

    public int getNumberOfStaff() {
        return NumberOfStaff;
    }

    public void setNumberOfStaff(int NumberOfStaff) {
        this.NumberOfStaff = NumberOfStaff;
    }	
}
class Main
{
	public static void main(String[] args) 
	{
		HOD hod = new HOD();	
		System.out.println(hod.getName());
		System.out.println(hod.getCollege());
		System.out.println(hod.getId());
		System.out.println(hod.isHasLaptop());
		System.out.println(hod.isTakeOnlineClasses());
		System.out.println(hod.getCabinNum());
		System.out.println(hod.getNumberOfStaff());
		System.out.println(hod.getNumberOfStaff());
	}
}