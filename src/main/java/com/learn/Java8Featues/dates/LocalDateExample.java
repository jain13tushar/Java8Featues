package com.learn.Java8Featues.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {

		LocalDate localDate = LocalDate.now();

		System.out.println("localDate : " + localDate);

		LocalDate localDate1 = LocalDate.of(2018, 07, 17);

		System.out.println("localDate1 : " + localDate1);

		LocalDate localDate2 = LocalDate.ofYearDay(2019, 365);

		System.out.println("localDate2 : " + localDate2);

		/**
		 * Get values from localDate
		 */

		System.out.println("getMonth : " + localDate.getMonth());
		System.out.println("getMonthValue : " + localDate.getMonthValue());
		System.out.println("getDayOfWeek : " + localDate.getDayOfWeek());
		System.out.println("Day of Month using get : " + localDate.get(ChronoField.DAY_OF_MONTH));

		/**
		 * Modifying Local Date
		 */

		System.out.println("plusDays : " + localDate.plusDays(2));
		System.out.println("plusMonths : " + localDate.plusMonths(2));
		System.out.println("minusDays : " + localDate.minusDays(2));
		System.out.println("withYear : " + localDate.withYear(2019));
		System.out.println("with ChronoField : " + localDate.with(ChronoField.YEAR, 2020));
		System.out.println("with TemporalAdjusters : " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("ChronoUnit minus : " + localDate.minus(1, ChronoUnit.YEARS));

		/**
		 * Additional Support methods
		 */

		System.out.println("leapyear " + localDate.isLeapYear());
		System.out.println("leapyear " + LocalDate.ofYearDay(2020, 01).isLeapYear());

		System.out.println("isEqual : " + localDate.isEqual(localDate1));
		System.out.println("isBefore : " + localDate.isBefore(localDate1));
		System.out.println("isAfter : " + localDate.isAfter(localDate1));

	}

}
