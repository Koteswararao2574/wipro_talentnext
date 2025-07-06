package arrays_Fundamentals;
import java.util.Arrays;
import java.util.Scanner;
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("min :"+arr[0]+"\n"+"max :"+arr[n-1]);
	}

}
