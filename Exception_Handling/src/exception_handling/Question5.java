package exception_handling;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter your name: ");
			String name = sc.nextLine();
			System.out.println("Enter your country: ");
			String country = sc.nextLine();
			if(!country.equals("India")) {
				throw new InvalidCountryException("User Outside India  cannot be registered");
			}else {
				System.out.println("User registration done successfully");
			}
		} catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
		sc.close();
		
	}

}

class UserRegister{
	String name;
	String country;
	public UserRegister(String name,String country) {
		this.name = name;
		this.country = country;
	}
}

class InvalidCountryException extends Exception{
	public InvalidCountryException(String message) {
		super(message);
	}
}
