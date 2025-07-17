package stringBuffer;
import java.util.Scanner;
public class Question15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		int i = 0;
		int j = word.length()-1;
		while(i != j && i < j) {
			if(word.charAt(i++) != word.charAt(j--)) {
				System.out.println("The given word " + word + " is not a palindrome");
				return;
			}
		}
		System.out.println("The given word " + word + " is a palindrome");

	}
}
