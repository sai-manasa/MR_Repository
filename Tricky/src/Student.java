
public class Student {

	String name;
	int age;
	String dept;
	
	public Student(String name)
	{
		this.name=name;
		System.out.println("inside student constructor "+name);
	}
	
	public void stuAge(int sage)
	{
		age=sage;
	}
	
	public void stuDept(String sdept)
	{
		dept=sdept;
	}
	
	public void printStudentInfo()
	
	{
		System.out.println("Student:-"+name);
		System.out.println("Age:-"+age);
		System.out.println("Dept:-"+dept);
		
	}
}
