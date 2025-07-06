package arrays_Fundamentals;
import java.util.Scanner;
public class Question31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] nums = new int[size];
		for (int i = 0; i < size; i++) {
			nums[i] = sc.nextInt();
		}
		int[] newNums = new int[size];
		int evenIndex = 0;
		int oddIndex = nums.length-1;
		for (int i = 0; i < size; i++) {
			if(nums[i] % 2 == 0) {
				newNums[evenIndex++] = nums[i];
			}else {
				newNums[oddIndex--] = nums[i];
			}
		}
		for(int i:newNums) {
			System.out.print(i + " ");
		}
	}

}
