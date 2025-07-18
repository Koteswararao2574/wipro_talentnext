package functionInerface;

import java.util.ArrayList;
import java.util.function.Function;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(123,"Sai",200000,"Ongole"));
		list.add(new Employee(456,"Bhupathi",200000,"Punjab"));
		list.add(new Employee(789,"Rajiv",25000,"Pune"));
		list.add(new Employee(112,"Raju",24000,"Pune"));
		list.add(new Employee(113,"Ravi",26000,"Pune"));
		Function<Employee, String> getLocation = emp -> emp.location;
		ArrayList<String> locations = new ArrayList<>();
		for(Employee emp: list) {
			locations.add(getLocation.apply(emp));
		}
		System.out.println("Employee Locations: " + locations);

	}

}


class Employee {
	int id;
	String name;
	int salary;
	String location;

	public Employee(int id, String name, int salary, String location) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.location = location;
	}

}
