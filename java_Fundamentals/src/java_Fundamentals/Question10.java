package java_Fundamentals;
import java.util.Scanner;
public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       char ch=sc.next().charAt(0);
       if(ch>=97 && ch<=122) {
    	   System.out.print(ch+"->"+Character.toUpperCase(ch));
       }
       else if(ch>=65 && ch<=90) {
    	   System.out.print(ch+"->"+Character.toLowerCase(ch));
       }
	}

}
