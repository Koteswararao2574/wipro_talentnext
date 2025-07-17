package stringBuffer;
import java.util.Scanner;
public class Question17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		sc.close();
		int i = findIndex(word);
		String newString = word.substring(0,i-1) + word.substring(i+2);
		System.out.println(newString);
	}
	
	static int findIndex(String word) {
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i) == '*') {
				return i;
			}
		}
		return 0;
	}
}
