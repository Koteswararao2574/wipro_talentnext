package stringBuffer;
import java.util.Scanner;
public class Question9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		if(n%2 == 0) {
			System.out.println(str.substring(0,n/2));
		}else {
			System.out.println("null");
		}
	}
}
