package stringBuffer;
import java.util.Scanner;
public class Question13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int n = sc.nextInt();
		int l = word.length();
		sc.close();
		String newWord = "";
		for(int i=0;i<n;i++) {
			newWord += word.substring(l-n,l);
		}
		System.out.println(newWord);
	}
}
