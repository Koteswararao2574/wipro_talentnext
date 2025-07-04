package java_Fundamentals;
import java.util.Scanner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch) {
		case 'R':System.out.print("Red");
		break;
		case 'B':System.out.print("Blue");
		break;
		case 'G':System.out.print("Green");
		break;
		case 'O':System.out.print("Orange");
		break;
		case 'Y':System.out.print("Yellow");
		break;
		case 'W':System.out.print("White");
		break;
		default:
			System.out.print("Invalid character");
		}

	}

}
