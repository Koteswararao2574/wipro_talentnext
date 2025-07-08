package classes_Objects;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		double num1=sc.nextDouble();
		double num2=sc.nextDouble();
		Calculator cal=new Calculator(num1,num2);
		System.out.println("The power int is "+cal.powerInt());
		System.out.println("The power int is "+(double)cal.powerInt());
		
        
	}

}
class Calculator{
	double num1;
	double num2;
	public Calculator(double num1,double num2) {
		this.num1=num1;
		this.num2=num2;
	}
	public int powerInt(){
		return (int)Math.pow(num1,num2);
	}
	public double powerDouble() {
		return (double)Math.pow(num1, num2);
	}
}
