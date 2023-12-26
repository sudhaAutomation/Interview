package javaInterviewScripts;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;

public class Calender1 {

	public static void main(String[] args) {
		// to perform additionm or substraction on current date
		Calendar c = Calendar.getInstance();// factory method
		c.set(2023, Calendar.AUGUST, 20);
		c.add(Calendar.DATE, 3);
		System.out.println(c.getTime());
		System.out.println(LocalDate.of(2023, 8, 20));

		toDayDate();

	}

	public static void toDayDate() {
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(new Date());
		System.out.println(Instant.now());
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
	}

}
