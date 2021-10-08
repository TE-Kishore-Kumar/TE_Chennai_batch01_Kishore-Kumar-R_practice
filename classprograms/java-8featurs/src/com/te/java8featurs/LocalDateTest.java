package com.te.java8featurs;

import java.time.LocalDate;

public class LocalDateTest {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
//		LocalDate date1 = LocalDate.of(1998, 4, 06);
		LocalDate date2 = LocalDate.parse("1998-04-06");

		System.out.println(date1);

		System.out.println("Day of the Month " + date1.getDayOfMonth());

		System.out.println("Day of the Year " + date1.getDayOfYear());

		System.out.println("Month Value " + date1.getMonthValue());

		System.out.println(date1.getDayOfWeek());

		System.out.println(date1.isLeapYear());

		System.out.println(date2.isAfter(date1));

		System.out.println(date2.isBefore(date1));

		System.out.println(date1.plusDays(1));
	}
}
