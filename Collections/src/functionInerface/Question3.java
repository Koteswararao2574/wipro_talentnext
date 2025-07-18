package functionInerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Question3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(Arrays.asList("12321","mam","madam","sai","welcome"));
		Predicate<String> isPalindrome = word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
		ArrayList<String> palindromes = list.stream().filter(isPalindrome).collect(Collectors.toCollection(ArrayList::new));
//		palindromes.forEach(System.out::println);
		System.out.println("Palindromes: " + palindromes);

	}

}
