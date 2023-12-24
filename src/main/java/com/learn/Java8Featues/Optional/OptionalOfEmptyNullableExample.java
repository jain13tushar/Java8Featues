package com.learn.Java8Featues.Optional;

import java.util.Optional;

public class OptionalOfEmptyNullableExample {

	/**
	 * Returns an Optional describing the specified value, if non-null, otherwise
	 * returns an empty.
	 */
	public static Optional<String> ofNullable() {
		Optional<String> stringOptional = Optional.ofNullable("Hello");
		return stringOptional;
	}

	/**
	 * Returns an Optional with the specified present non-null value.
	 */
	public static Optional<String> of() {
		Optional<String> stringOptional = Optional.of("Hello");
		return stringOptional;
	}

	public static Optional<String> empty() {
		return Optional.empty();
	}

	public static void main(String[] args) {

		System.out.println(ofNullable().get());

		System.out.println(of().get());

		System.out.println(empty());

	}

}
