package exception_handling;
import java.util.Scanner;
public class Question1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the number of elements in the array: ");
			int size = Integer.parseInt(sc.nextLine());
			int[] nums = new int[size];
			System.out.println("Enter the elements in the array: ");
			for (int i = 0; i < size; i++) {
				nums[i] = Integer.parseInt(sc.nextLine());
			}
			System.out.println("Enter the index of the array element you want to access");
			int target = Integer.parseInt(sc.nextLine());
			System.out.println("The array element at index " + target + " = " + nums[target]);
			System.out.println("The array element successfully accessed");
			
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} catch(NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		sc.close();
	}
}
