package arrays_Fundamentals;
import java.util.Scanner;
public class Question30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		int sum = 0;
		boolean ignore = false;
		for(int i=0;i<nums.length;i++) {
			if(nums[i] == 6) {
				ignore = true;
			}
			if(!ignore) {
				sum = sum + nums[i];
			}
			if(ignore && nums[i] == 7) {
				ignore = false;
			}
			
		}
		
		System.out.println(sum);
	}

}
