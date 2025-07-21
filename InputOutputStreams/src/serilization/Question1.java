package serilization;

import java.io.*;
import java.util.Date;

public class Question1 {

	public static void main(String[] args) {
		String filename = "data";
		Employee emp = new Employee("Ravi", new Date(), "IT", "Developer", 75000.0);

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filename))) {
			out.writeObject(emp);
			System.out.println("Employee object serialized to 'data' file.");
		} catch (IOException e) {
			System.out.println("Serialization error: " + e.getMessage());
		}

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filename))) {
			Employee deserializedEmp = (Employee) in.readObject();
			System.out.println("\nDeserialized Employee Details:");
			deserializedEmp.display();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Deserialization error: " + e.getMessage());

		}

	}
}

class Employee implements Serializable {
	private String name;
	private Date dateOfBirth;
	private String department;
	private String designation;
	private double salary;

	public Employee() {

	}

	public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
		this.setName(name);
		this.setDateOfBirth(dateOfBirth);
		this.setDepartment(department);
		this.setDesignation(designation);
		this.setSalary(salary);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Date of Birth: " + dateOfBirth);
		System.out.println("Department: " + department);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
	}
}
