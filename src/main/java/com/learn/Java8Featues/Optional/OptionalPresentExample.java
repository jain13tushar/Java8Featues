package com.learn.Java8Featues.Optional;

import java.util.Optional;

public class OptionalPresentExample {

	public static void main(String[] args) {

		Optional<String> optional = Optional.ofNullable("hello");

		System.out.println(optional.isPresent());

		if (optional.isPresent()) {
			System.out.println(optional.get());
		}

		optional.ifPresent(s -> System.out.println(s));

	}

}
