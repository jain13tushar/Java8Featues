package com.learn.Java8Featues.defaults;

public interface Interface4 {

	default void methodA() {
		System.out.println("Inside Method A : " + Interface4.class);
	}

}
