package dateTimeApi;

import java.time.LocalTime;

public class Question6 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime before5Hrs30Min = time.minusHours(5).minusMinutes(30);
		System.out.println("Current time: " + time);
		System.out.println("Time before 5 Hrs 30 Mins: " + before5Hrs30Min);

	}

}
