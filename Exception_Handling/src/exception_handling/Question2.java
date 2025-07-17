package exception_handling;

public class Question2 {
	public static void main(String[] args) {
		try {
			int age = Integer.parseInt(args[1]);
			if (age < 18 || age >= 60) {
				throw new InvalidAgeException("Invalid! The age must be between 18 and 60");
			} else {
				System.out.println("Name: " + args[0] + " and Age: " + args[1] + " are accepted.");
			}
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

}

class InvalidAgeException extends Exception {
	InvalidAgeException(String message) {
		super(message);
	}
}
