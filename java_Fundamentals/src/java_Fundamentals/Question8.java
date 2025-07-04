package java_Fundamentals;
import java.util.Scanner;
public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isDigit(ch)) {
        	System.out.print("Digit");
        }
        else if(Character.isLetter(ch)) {
        	System.out.print("Alphabet");
        }
        else {
        	System.out.print("Special Character");
        }
	}

}
