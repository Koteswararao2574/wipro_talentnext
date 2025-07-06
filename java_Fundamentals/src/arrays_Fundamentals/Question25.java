package arrays_Fundamentals;
import java.util.Arrays;
import java.util.Scanner;
public class Question25 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++) {
		arr[i]=sc.nextInt();
	}
	Arrays.sort(arr);
	System.out.println("Two min values :"+arr[0]+","+arr[1]);
	System.out.println("Two min values :"+arr[n-1]+","+arr[n-2]);
}
}
