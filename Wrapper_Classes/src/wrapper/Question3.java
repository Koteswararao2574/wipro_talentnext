package wrapper;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 255: ");
		int num =sc.nextInt();
		if(num < 1 || num  > 255) {
			System.out.println("Invalid input!!!");
			System.out.println("Enter a number between 1 to 255: ");
			return;
		}
		String binary = Integer.toBinaryString(num);
		String padded = String.format("%8s", binary).replace(' ', '0');
		System.out.println("Binary equivalent(8-bit) : " + padded);
		

	}

}
