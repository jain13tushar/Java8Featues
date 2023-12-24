package com.learn.Java8Featues.defaults;

public class Client14 implements Interface1, Interface4 {

	@Override
	public void methodA() {
		System.out.println("Inside Method A : " + Client123.class);
	}

	public static void main(String[] args) {

		Client14 client14 = new Client14();
		client14.methodA();

	}

}
