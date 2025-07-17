package optional_class;

import java.util.Optional;

public class Question22 {

	public static void main(String[] args) {
		Employee emp = null;
		Employee opt = Optional.ofNullable(emp).orElseThrow(() -> new InvalidEmployeeException("Employee not found"));
		opt.display();
	}

}

class Employee{
	String name;
	
	public Employee(String name) {
		this.name = name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	String getName() {
		return this.name;
	}
	
	void display() {
		System.out.println("Name: " + name);
	}
}

class InvalidEmployeeException extends RuntimeException{
	public InvalidEmployeeException(String message) {
		super(message);
	}
}
