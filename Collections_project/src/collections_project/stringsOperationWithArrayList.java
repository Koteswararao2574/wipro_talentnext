package collections_project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class stringsOperationWithArrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1 = sc.nextLine();
		System.out.println("Enter the second string");
		String str2 = sc.nextLine();
		ArrayList<String> result = performOperations(str1, str2);
		System.out.println(result);

	}

	static ArrayList<String> performOperations(String str1, String str2) {
		ArrayList<String> result = new ArrayList<>();

		StringBuilder sb1 = new StringBuilder();
		for (int i = 0; i < str1.length(); i++) {
			if (i % 2 == 0) {
				sb1.append(str2);
			} else {
				sb1.append(str1.charAt(i));
			}
		}
		result.add(sb1.toString());

		int firstOccurenceIndex = str1.indexOf(str2);
		int lastOccurenceIndex = str1.lastIndexOf(str2);
		if (firstOccurenceIndex != lastOccurenceIndex) {
			StringBuilder sb2 = new StringBuilder(str1);
			String reversed = new StringBuilder(str2).reverse().toString();
			sb2.replace(lastOccurenceIndex, lastOccurenceIndex + str1.length(), reversed);
			result.add(sb2.toString());
		}

		if (firstOccurenceIndex != lastOccurenceIndex) {
			StringBuilder sb3 = new StringBuilder(str1);
			sb3.delete(firstOccurenceIndex, firstOccurenceIndex + str2.length());
			result.add(sb3.toString());
		}

		int half = str2.length() / 2;
		int remaining = str2.length() % 2;
		String firstHalf = str2.substring(0, half + remaining);
		String secondHalf = str2.substring(half + remaining);
		result.add(firstHalf + str1 + secondHalf);

		Set<Character> unique = new HashSet<>();

		for (char ch : str2.toCharArray()) {
			unique.add(ch);
		}

		StringBuilder sb4 = new StringBuilder();
		for (char ch : str1.toCharArray()) {
			if (unique.contains(ch)) {
				sb4.append("*");
			} else {
				sb4.append(ch);
			}
		}
		result.add(sb4.toString());

		return result;

	}

}
