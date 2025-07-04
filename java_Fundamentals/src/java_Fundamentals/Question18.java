package java_Fundamentals;
import java.util.Scanner;
public class Question18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String input=sc.next();
        if(input.trim().isEmpty()) {
        	System.out.print("Please enter a integer value");
        }
        else {
        	int num=Integer.parseInt(input);
        	int row=1;
        	while(row<=num) {
        		for(int col=1;col<=row;col++) {
        			System.out.print("* ");
        		}
        		row++;
        		System.out.println("");
        	}
        }
	}

}
