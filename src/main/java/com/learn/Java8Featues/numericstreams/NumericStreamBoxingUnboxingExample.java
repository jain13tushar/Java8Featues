package com.learn.Java8Featues.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Boxing() - Converting a primitive type to Wrapper Class type.
 * 
 * Unboxing() - Converting a Wrapper Class type to primitive type.
 * 
 * @author tushar
 *
 */
public class NumericStreamBoxingUnboxingExample {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10) // intstream of 10 elements
				// int
				.boxed()
				// Integer
				.collect(Collectors.toList());
	}

	public static int unBoxing(List<Integer> interList) {
		// Wrapper to primitive
		return interList.stream()
				// Wrapper Integer Values
				.mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {

		System.out.println("Boxing : " + boxing());

		List<Integer> integerList = boxing();
		System.out.println("Unboxing : " + unBoxing(integerList));

	}

}
