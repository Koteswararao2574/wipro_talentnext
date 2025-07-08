package Inheritance;

public class employee extends person{
	private double salary;
	private String joiningYear;
	private String insuranceNo;
	
	public employee(String name, double salary, String joiningYear, String insuranceNo) {
		super(name);
		this.setSalary(salary);
		this.setJoiningYear(joiningYear);
		this.setInsuranceNo(insuranceNo);
	
	}

	public void setInsuranceNo(String insuranceNo) {
		this.insuranceNo = insuranceNo;
	}
	
	public void setJoiningYear(String joiningYear) {
		this.joiningYear = joiningYear;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getInsuranceNo() {
		return insuranceNo;
	}

	public String getJoiningYear() {
		return joiningYear;
	}

	public double getSalary() {
		return salary;
	}
}
