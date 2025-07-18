package dateTimeApi;

import java.time.LocalTime;

public class Question5 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		LocalTime after25Min = time.plusMinutes(25);
		System.out.println("Current time: " + time);
		System.out.println("Time after 25 minutes: " + after25Min);
	}

}
