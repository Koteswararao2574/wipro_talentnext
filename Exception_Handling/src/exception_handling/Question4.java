package exception_handling;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfStudents = 2;
		int[] marks = new int[3];
		try {
			for (int i = 1; i <= noOfStudents; i++) {
				System.out.println("Enter the name of the student " + i + " :");
				String name = sc.nextLine();
				int total = 0;
				for (int j = 0; j < 3; j++) {
					System.out.println("Enter the marks in subject " + (j + 1) + " : ");
					int subMarks = sc.nextInt();
					if (subMarks < 0) {
						throw new NegativeValueException("Please enter only positive numbers.");
					}
					if (subMarks > 100) {
						throw new OutOfRangeException("Please enter marks less than 100.");
					}
					marks[j] = subMarks;
					total += subMarks;
				}
				sc.nextLine();
				System.out.println("Student: " + name);
				System.out.println("Avg. Marks: " + (double) total / 3);
//				System.out.println();
			}
		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		} catch (OutOfRangeException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}

class NegativeValueException extends Exception {
	NegativeValueException(String message) {
		super(message);
	}
}

class OutOfRangeException extends Exception {
	OutOfRangeException(String message) {
		super(message);
	}
}
