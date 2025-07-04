package java_Fundamentals;
import java.util.Scanner;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
       String gender=sc.next();
       int age=sc.nextInt();
       if(gender.equals("Female")) {
    	   if(age>=1 && age<=58) {
    		   System.out.print("The percentage of interest is 8.2%");
    	   }
    	   else if(age>=59 && age<=100) {
    		   System.out.print("The percentage of interest is 9.2%");
    	   }
       }
       else if(gender.equals("Male")) {
    	   if(age>=1 && age<=58) {
    		   System.out.print("The percentage of interest is 8.4%");
    	   }
    	   else if(age>=59 && age<=100) {
    		   System.out.print("The percentage of interest is 10.5%");
    	   }
       }
	}

}
