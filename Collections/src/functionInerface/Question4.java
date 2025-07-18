package functionInerface;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question4 {

	public static void main(String[] args) {
		ArrayList<EmpData> list = new ArrayList<>();
		list.add(new EmpData(111, "Sunny", 12500));
		list.add(new EmpData(112, "Vicky", 1200));
		list.add(new EmpData(113, "Sidhu", 9500));
		list.add(new EmpData(114, "Priya", 1100));
		list.add(new EmpData(115, "Ravi", 8500));
		Predicate<EmpData> getSalaries = sal -> sal.getSalary() < 10000;
		ArrayList<String> names = list.stream().filter(getSalaries).map(EmpData::getName)
				.collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Persons with salaries less than 10000: " + names);
		}
	}
