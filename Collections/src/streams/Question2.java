package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<Employee> list = new ArrayList<>();
		list.add(new Employee(123,"Sai",21,"Ongole"));
		list.add(new Employee(456,"Bhupathi",21,"Punjab"));
		list.add(new Employee(789,"Rajiv",25,"Pune"));
		list.add(new Employee(112,"Raju",24,"Pune"));
		list.add(new Employee(113,"Ravi",26,"Pune"));
		ArrayList<Employee> location = list.stream().filter(emp -> emp.location.equals("Pune")).collect(Collectors.toCollection(ArrayList::new));
//		System.out.println(location);
		location.forEach(System.out::println);
	}

}
