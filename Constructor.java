package Assisted_project;
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

 class constructorDemo {

public static void main(String[] args) {

	EmpInfo emp1=new EmpInfo();
	EmpInfo emp2=new EmpInfo();

	emp1.display();
	emp2.display();
	}
}

//parameterized constructor
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Constructor {
public static void main(String[] args) {

	Std std1=new Std(2,"Jatin");
	Std std2=new Std(10,"Raj");
	std1.display();
	std2.display();
		}
}