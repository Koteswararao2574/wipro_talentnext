package streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(111,"Sai",100));
		list.add(new Student(112,"Ram",90));
		list.add(new Student(113,"Prabhas",95));
		list.add(new Student(114,"Arjun",90));
		list.add(new Student(115,"Mahesh",89));
		ArrayList<Student> passed = list.stream().filter(n -> n.marks >= 50).collect(Collectors.toCollection(ArrayList::new));
		passed.forEach(System.out::println);
		System.out.println("Number of passed student: " + passed.size());
	}

}
