package arrays_Fundamentals;
import java.util.Scanner;
public class Question29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		int[] nums2 = new int[nums.length];
		int index = 0;
		for (int i = 0; i < size; i++) {
			if(nums[i] != 10) {
				nums2[index++] = nums[i];
			}
		}
		for(int i:nums2) {
			System.out.println(i + " ");
		}
	}

}
