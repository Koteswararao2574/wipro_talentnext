package arrays_Fundamentals;
import java.util.Scanner;
public class Question34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for(int i=0;i<nums.length;i++) {
			nums[i] = sc.nextInt();
		}
		int k = 0;
		int[] newNums = new int[size];
		for(int i=0;i<nums.length;i++) {
			boolean isTrue = check(newNums, nums[i]);
			if(isTrue) {
				newNums[k++] = nums[i];
			}
			
		}
		for(int i=0;i<k;i++) {
			System.out.print(newNums[i] + " ");
		}
		

	}
	
	static boolean check(int[] newNums, int j) {
		for(int i=0;i<newNums.length;i++) {
			if(j == newNums[i]) return false;
		}
		return true;
	}

}
