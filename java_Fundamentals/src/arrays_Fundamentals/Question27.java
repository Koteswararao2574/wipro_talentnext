package arrays_Fundamentals;

public class Question27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums1 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] nums2 = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] nums3 = new int[3][2];
		for(int i=0;i<nums3.length;i++) {
			for(int j=0;j<nums3[0].length;j++) {
				if(j == 0) {
					nums3[i][j] = nums1[i][1];
				}else {
					nums3[i][j] = nums2[i][1];
				}
				System.out.print(nums3[i][j] + " ");
				
			}
			System.out.println();
		}
	}

}
