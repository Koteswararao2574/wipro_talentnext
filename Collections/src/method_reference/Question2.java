package method_reference;

public class Question2 {

	public static void main(String[] args) {
		Digits dd = CountDigits::count;
		int n = 1234567;
		System.out.println("Number of digits in " + n + " is " +  dd.count(n));

	}

}

interface Digits{
	int count(int n);
}

class CountDigits{
	
	public static int count(int n) {
		int count = 0;
		while(n != 0) {
			n /= 10;
			count++;
		}
		return count;
	}
}
