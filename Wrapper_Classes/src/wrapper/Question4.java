package wrapper;

public class Question4 {

	public static void main(String[] args)throws CloneNotSupportedException {
		Employee emp1 = new Employee(111, "Sai", 150000);
		Employee emp2 = (Employee)emp1.clone();
		emp1.name = "Chandran";
		emp1.salary = 200000;
		System.out.print("Original Value: " );
		emp1.display();
		System.out.print("Cloned Value: " );
		emp2.display();

	}

}


class Employee implements Cloneable{
	int id;
	String name;
	int salary;
	public Employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public void display() {
		System.out.println("Emp ID: " + id + ", Emp Name: " + name + ", Emp Salary: " + salary);
	}
}
