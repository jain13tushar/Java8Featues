package com.learn.Java8Featues.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DatetoLocalDateExample {

	public static void main(String[] args) {

		/**
		 * java.util.Date to LocalDate and vice versa.
		 */
		Date date = new Date();
		System.out.println(date);

		LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		System.out.println(localDate);

		new Date();
		Date date1 = Date.from(localDate.atTime(LocalTime.now()).atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("java.util.date is : " + date1);

		/**
		 * java.sql.Date to LocalDate and vice versa.
		 */

		java.sql.Date date2 = java.sql.Date.valueOf(localDate);
		System.out.println(date2);

		LocalDate localDate2 = date2.toLocalDate();
		System.out.println("converted Local Date : " + localDate2);

	}

}
