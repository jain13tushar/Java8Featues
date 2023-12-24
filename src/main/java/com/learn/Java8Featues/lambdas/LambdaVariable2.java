package com.learn.Java8Featues.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

	static int value = 4;

	public static void main(String[] args) {

		Consumer<Integer> c1 = (i) -> {
			value++;
			System.out.println(value);
		};

		c1.accept(4);

	}

}
