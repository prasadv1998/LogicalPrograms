package logicalprograms;

import java.time.temporal.ChronoUnit;
import java.time.*;

public class StopWatch {

	public static void main(String[] args) {
		LocalTime StartTime = LocalTime.of(21, 17, 20);
		LocalTime StopTime = LocalTime.of(23, 21, 17);
		long hours = ChronoUnit.HOURS.between(StartTime, StopTime);
		long minutes = ChronoUnit.MINUTES.between(StartTime, StopTime);
		long seconds = ChronoUnit.SECONDS.between(StartTime, StopTime);
		System.out.println("Difference is " + hours + " hours " + (minutes % 60) + " minutes " + (seconds % 60) + " seconds.");
	}
}