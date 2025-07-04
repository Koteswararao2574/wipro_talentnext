package java_Fundamentals;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        char c1=sc.next().charAt(0);
        char c2=sc.next().charAt(0);
        if(c1<=c2) {
        	System.out.print(c1+","+c2);
        }
        else {
        	System.out.print(c2+","+c1);
        }
	}

}
