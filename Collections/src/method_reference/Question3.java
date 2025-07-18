package method_reference;

public class Question3 {

	public static void main(String[] args) {
		checkPrime cp = Prime::new;
		int n = 97;
		cp.createPrime(n);

	}

}


interface checkPrime{
	Prime createPrime(int n);
}

class Prime{
	public Prime(int n) {
		if(n % 2 == 0) {
			System.out.println(n + " - Not Prime.");
			return;
		}
		for(int i=3;i<Math.sqrt(n);i += 2) {
			if(n % i == 0) {
				System.out.println(n + " - Not Prime.");
				return;
			}
		}
		System.out.println(n + " - Prime.");
	}
}
