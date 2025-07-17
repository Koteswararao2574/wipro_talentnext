package stringBuffer;
import java.util.Scanner;
public class Question11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String shorter = sc.nextLine();
		String longer = sc.nextLine();
		sc.close();
		if(shorter.length() < longer.length()) {
			System.out.println(shorter+longer+shorter);
		}else {
			System.out.println(longer+shorter+longer);
		}
		
	}
}
