package dateTimeApi;

import java.time.LocalDate;

public class Question1 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate date2 = date.plusDays(10);
		System.out.println("Today date is: " + date);
		System.out.println("Date after ten days is: " + date2);

	}

}
