package functionInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class Question7 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		Consumer<Integer> cc = num -> {
			String type = (num % 2 == 0)?"Even":"Odd";
			System.out.println(num + " " + type);
		};
		
		nums.forEach(cc);

	}

}
