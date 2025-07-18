package functionInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question5 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,16,25,36,49,12,27,35));
		Predicate<Integer> sq = n -> Math.sqrt(n) % 1 == 0;
		ArrayList<Integer> result = list.stream().filter(sq).collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Perfect Squares: " + result);

	}

}
