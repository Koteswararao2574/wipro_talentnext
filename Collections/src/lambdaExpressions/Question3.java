package lambdaExpressions;

import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("Hi");
		list.add("Welcome");
		list.add("Have");
		list.add("Good");
		list.add("Day");
		list.add("How");
		list.add("Are");
		list.add("You");
		list.add("Okay");
		list.forEach(s -> {
			if(s.length() % 2 != 0) {
				System.out.println(s);
			}
		});

	}

}
