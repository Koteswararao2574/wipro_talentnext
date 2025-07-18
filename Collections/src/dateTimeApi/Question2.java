package dateTimeApi;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question2 {

	public static void main(String[] args) {
		LocalDate nextMonth = LocalDate.now().plusMonths(1);
		LocalDate firstDay = nextMonth.withDayOfMonth(1);
		int count = 0;
		LocalDate secondSunday = null;
		
		for(int i=0;i<31;i++) {
			LocalDate date = firstDay.plusDays(i);
			if(date.getMonth() != nextMonth.getMonth()) break;
			if(date.getDayOfWeek() == DayOfWeek.SUNDAY) {
				count++;
				if(count == 2) {
					secondSunday = date;
					break;
				}
			}
			
		}
		System.out.println("Date of next month Second Sunday: " + secondSunday);
	}

}
