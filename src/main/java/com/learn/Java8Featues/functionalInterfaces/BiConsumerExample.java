package com.learn.Java8Featues.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class BiConsumerExample {

	public static void nameAndActivities() {

		BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
			System.out.println(name + " : " + activities);
		};

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach((student) -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biConsumer = (a, b) -> {
			System.out.println("a : " + a + " , b : " + b);
		};

		biConsumer.accept("java7", "java8");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {
			System.out.println("Multiplication : " + (a * b));
		};

		BiConsumer<Integer, Integer> division = (a, b) -> {
			System.out.println("Division : " + (a / b));
		};

		biConsumer.accept("java7", "java8");
		multiply.andThen(division).accept(10, 5);

		nameAndActivities();

	}

}
