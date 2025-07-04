package java_Fundamentals;
import java.util.Scanner;
public class Question19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int rev=0;
        while(num>0) {
        	int rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }
        System.out.print(rev);
	}

}
