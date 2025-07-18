package dateTimeApi;

import java.time.LocalDate;
import java.time.Period;

public class Question3 {

	public static void main(String[] args) {
		LocalDate joiningDate = LocalDate.of(2025,07, 03);
		LocalDate currentDate = LocalDate.now();
		Period experience = Period.between(joiningDate, currentDate);
		System.out.println("Experiece = Year:" + experience.getYears() + " Months: " + experience.getMonths() + " Days: " + experience.getDays());

	}

}
