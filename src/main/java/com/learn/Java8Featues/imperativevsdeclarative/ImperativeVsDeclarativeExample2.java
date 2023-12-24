package com.learn.Java8Featues.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		/**
		 * Imperative
		 */

		List<Integer> uniqueList = new ArrayList<>();

		for (Integer integer : integerList) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}

		System.out.println("uniqueList : " + uniqueList);

		/**
		 * Declarative
		 */

		List<Integer> uniqueList1 = integerList.stream().distinct().collect(Collectors.toList());

		System.out.println("uniqueList1 : " + uniqueList1);

	}

}
