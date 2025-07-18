package lambdaExpressions;

import java.util.ArrayList;
import java.util.Random;

public class Question1 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 25; i++) {
			list.add(random.nextInt(100) + 1);
		}
		System.out.println("List: " + list);
		list.forEach(n -> {
			if (isPrime(n)) {
				System.out.print(n + " ");
			}
		});

	}

	static boolean isPrime(int n) {
		if (n % 2 == 0) {
			return false;
		}
		for (int i = 3; i < Math.sqrt(n); i += 2) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
