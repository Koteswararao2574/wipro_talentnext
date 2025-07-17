package stringBuffer;
import java.util.Scanner;
public class Question14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		int i = 0;
		int j = 0;
		String newString = "";
		sc.close();
		while(i < str1.length() && j< str2.length()) {
			newString += str1.charAt(i++) + ""  + str2.charAt(j++);
		}
		if(i < str1.length()-1) {
			newString += str1.substring(i);
		}
		
		if(i < str2.length()-1) {
			newString += str2.substring(j);
		}
		System.out.println(newString);

	}
}
