package abstractAndInterfaces;

public class LambdaExample {

	public static void main(String[] args) {
		Test t1 = (a,b,c) -> a+b+c;
		Test t2 = (a,b,c) -> a*b*c;
		int sum = t1.myFunction(1,2,3);
		int product = t2.myFunction(1,2,3);
		System.out.println("Sum :" + sum);
		System.out.println("Product :" + product);
	}

}
