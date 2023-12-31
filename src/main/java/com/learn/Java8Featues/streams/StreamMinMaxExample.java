package com.learn.Java8Featues.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static int findMaxValue(List<Integer> integerList) {
		return integerList.stream().reduce(0, Integer::max);
	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce(Integer::max);
	}

	public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
		return integerList.stream().reduce(Integer::min);
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

		System.out.println(findMaxValue(integerList));

	}

}
