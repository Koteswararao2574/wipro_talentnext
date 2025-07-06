package arrays_Fundamentals;
import java.util.Scanner;
public class Question24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++) {
        	if(arr[i]>=32  && arr[i]<=122) {
        		System.out.print(arr[i] + " -> " + (char)arr[i]+",");
        	}
        	else {
                System.out.println(arr[i] + " is not a valid character in Java char range.");
            }
        }
	}

}
