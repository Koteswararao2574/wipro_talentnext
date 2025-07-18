package method_reference;

public class Question1 {

	public static void main(String[] args) {
		Fact ff = new Fact();
		int n = 5;
		Factorial fact = ff::factorialFun;
		System.out.println("Facorial of " + n + " is: " + fact.factorialFun(n));

	}

}

@FunctionalInterface
interface Factorial {
	int factorialFun(int n);
}

class Fact {
	int factorialFun(int n) {
		if (n == 1 || n == 0)
			return n;
		int fact = n * factorialFun(n - 1);
		return fact;
	}

}
