package arrays_Fundamentals;
import java.util.Scanner;
public class Question33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		for(int i =0 ;i< nums.length-1;i++) {
			for(int j=0;j<nums.length-i-1;j++) {
				if(nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		System.out.println("The largest 2 numbers is: " + nums[nums.length-1] + ", " + nums[nums.length-2]);
		System.out.println("The smallest 2 numbers is: " + nums[0] + ", " + nums[1]);
	}

}
