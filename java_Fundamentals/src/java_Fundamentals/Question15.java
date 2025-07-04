package java_Fundamentals;
import java.util.Scanner;
public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean isPrime=true;
        if(num<=1) {
        	isPrime=false;
        }
        else {
        	for(int i=2;i<Math.sqrt(num);i++) {
        		if(num%i==0) {
        			isPrime=false;
        			break;
        		}
        	}
        }
        if(isPrime) {
        	System.out.print("Prime");
        }
        else {
    	System.out.print("not Prime");
        }

	}

}
