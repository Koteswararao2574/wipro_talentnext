package List;

public class Employee {
	private int empId;
	private String empName;
	private String email;
	private String gender;
	private float salary;

	public Employee(int empId, String empName, String email, String gender, float salary) {
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}

	int getEmpId() {
		return this.empId;
	}

	String getEmpName() {
		return this.empName;
	}

	String getEmail() {
		return this.email;
	}

	String getGender() {
		return this.gender;
	}

	float getSalary() {
		return this.salary;
	}

	void GetEmployeeDetails() {
		System.out.println("Emp Id: " + getEmpId());
		System.out.println("Emp Name: " + getEmpName());
		System.out.println("Emp Email: " + getEmail());
		System.out.println("Emp Gender: " + getGender());
		System.out.println("Emp Salary: " + getSalary());
	}
	
	public String toString() {
		return "Emp Id: " + getEmpId() + "," + " Emp Name: " + getEmpName()+ "," + " Emp Email: " + getEmail()+ "," +" Emp Gender: " + getGender()+ "," + "Emp Salary: " + getSalary();
		
	}

}
