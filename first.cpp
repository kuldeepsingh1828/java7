#include <iostream>
using namespace  std;
class PrintStream
{
public:
	static void print()
	{
		cout<<"Main is in class A...\n";
	}

};
class System
{
	public :
	static PrintStream out;
};
int main()
{
	System::out.print();
}