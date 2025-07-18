package functionInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class Question2 {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Function<ArrayList<Integer>, Integer> getSum = num -> num.stream().mapToInt(i -> i).sum();
		System.out.println("Sum of integers: " + getSum.apply(nums));
	}

}
