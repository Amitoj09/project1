package pkg_1;

public class student 
{
	int rollNo;
	int age;
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}

	public static void main(String[] args) 
	{
	student abc=new student();
		abc.age=23;
		abc.rollNo=12;
		abc.display1();
		abc.display2();
		System.out.println(abc.age);
		System.out.println(abc.rollNo);

	}
}
