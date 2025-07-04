package java_Fundamentals;
import java.util.Scanner;
public class Question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          int num1=sc.nextInt();
          int num2=sc.nextInt();
          if(num1%10 == num2%10) {
        	  System.out.print("lastDigit ( "+num1+" , "+num2+" ) -> true");
          }
          else {
        	  System.out.print("lastDigit ( "+num1+" , "+num2+" ) -> false");
          }
	}

}
