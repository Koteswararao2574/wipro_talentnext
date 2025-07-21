package wrapper;

public class Question2 {

	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Please provide input through command line.");
			return;
		}
		int num = Integer.parseInt(args[0]);
		System.out.println("Given number :" + num);
		System.out.println("Binary equivalent :"+ Integer.toBinaryString(num));
		System.out.println("Octal equivalent :" + Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent :" + Integer.toHexString(num).toUpperCase());

	}

}
