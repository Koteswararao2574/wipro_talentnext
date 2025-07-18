package dateTimeApi;

import java.time.LocalDate;

public class Question4 {

	public static void main(String[] args) {
		int year = LocalDate.now().getYear();
		if(LocalDate.of(year, 1, 1).isLeapYear()) {
			System.out.println(year + " is a LeapYear");
		}else {
			System.out.println(year + " is NOT a LeapYear");
		}

	}

}
