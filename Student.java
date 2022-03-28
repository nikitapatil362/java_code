
public class Student {
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
		
	}
	
	public void print()
	
	{
		System.out.println(id+" "+name);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student s1 =new Student(123,"Nikita");
		
		Student s2 = new Student(234,"Sonal");
		
		s1.print();
		
		s2.print();
		
		
	}

}
