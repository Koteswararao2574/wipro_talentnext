package functionInerface;

import java.util.ArrayList;
import java.util.function.Supplier;

public class Question8 {

	public static void main(String[] args) {
		Supplier<ArrayList<Integer>> getPrimes = () -> {
			ArrayList<Integer> primes = new ArrayList<>();
			int start = 2;
			while(primes.size() < 10) {
				boolean isPrime = true;
				for(int i = 2;i <= Math.sqrt(start);i++) {
					if(start % i == 0) {
						isPrime = false;
						break;
					}
				}
				if(isPrime) {
					primes.add(start);
				}
				start++;
			}
			return primes;
		};
		
		System.out.println("First 10 Prime Numbers: " + getPrimes.get());

	}

}
