package arrays_Fundamentals;
import java.util.Scanner;
public class Question28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {
			if (nums[i] != 1 && nums[i] != 4) {
				System.out.println("false");
				return;
			}

		}
		System.out.println("true");
	}

}
