#include <iostream>
using namespace  std;
class Student
{
	private:
	 int id;
	  string name;
	public:
	Student() // Constructor
	{
		
		name = "Demo";
		id = 13234;
	}
	void Display() // function to display data
	{
		cout<<"\nName is : "<<name;
		cout<<"\nID   is : "<<id<<endl;
	}
};
int main()
{
	Student *s = new Student();
	s->Display();
}