package arrays_Fundamentals;
import java.util.Scanner; 
public class Question21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
        	arr[i]=sc.nextInt();
        	sum+=arr[i];
        }
        System.out.println("average :"+sum/n);
        System.out.print("sum :"+sum); 
	}

}
