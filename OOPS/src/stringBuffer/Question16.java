package stringBuffer;
import java.util.Scanner;
public class Question16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			String str1 = sc.nextLine();
			String str2 = sc.nextLine();
			sc.close();
			if(str1.charAt(str1.length()-1) != str2.charAt(0)) {
				System.out.println(str1 + " " + str2);
			}else {
				System.out.println(str1 + str2.substring(1));
			}
	}

}
