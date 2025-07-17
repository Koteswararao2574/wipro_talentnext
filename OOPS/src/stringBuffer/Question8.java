package stringBuffer;
import java.util.Scanner;
public class Question8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int n = word.length();
		String newString = "";
		for(int i=0;i<n;i++) {
			newString += word.substring(0,2);
		}
		sc.close();
		System.out.println(newString);

	}
}
