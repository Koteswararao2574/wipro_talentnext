package java_Fundamentals;
import java.util.Scanner;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		while(num>0) {
			sum+=num%10;
			num=num/10;
		}
		System.out.print(sum);

	}

}
