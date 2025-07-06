package arrays_Fundamentals;
import java.util.Scanner;
public class Question23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int target=sc.nextInt();
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.print(find(arr,target));
	}
	public static int find(int[] arr,int target) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
			}
		}
		return -1;
	}

}
