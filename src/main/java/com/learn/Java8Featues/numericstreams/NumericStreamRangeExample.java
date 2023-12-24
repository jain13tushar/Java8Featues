package com.learn.Java8Featues.numericstreams;

import java.util.stream.IntStream;

public class NumericStreamRangeExample {

	public static void main(String[] args) {

		IntStream intStream = IntStream.range(1, 50);
		System.out.println(intStream.count());

		IntStream.range(1, 50).forEach((value -> System.out.print(value + ",")));
		System.out.println();
		System.out.println("Range Closed Count : " + IntStream.rangeClosed(1, 50).count());
		IntStream.rangeClosed(1, 50).forEach((value -> System.out.print(value + ",")));

	}

}
