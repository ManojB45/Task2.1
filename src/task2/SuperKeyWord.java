package task2;

//Base class as Person
class person123{
	 int a=20;
	 String name="manu";
	 
	 //Default constructor
	  public person123() {}
}

class Employee extends person123{
	 double sal=20000;
	 int empid=21;
	 
	 public Employee() {
		super();
	}
	public void addon()
	 {
		 System.out.println("test addon is excuted");
		 System.out.println(super.a);
		
	 }
}

public class SuperKeyWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee data=new Employee();
		System.out.println("Employee age:"+data.a);
		System.out.println("Employee name:"+data.name);
		System.out.println("Employee salary:"+data.sal);
		System.out.println("Employee id:"+data.empid);

	}

}
