package java_Fundamentals;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int temp=num;
        int rev=0;
        while(num>0) {
        	int rem=num%10;
        	rev=rev*10+rem;
        	num=num/10;
        }
        if(rev==temp) {
        	System.out.print(temp+" is a palindrome");
        }
        else {
        	System.out.print(temp+" is not a palindrome");
        }

	}

}
