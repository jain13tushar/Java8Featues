package com.learn.Java8Featues.methodreference;

import java.util.function.Consumer;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> c1 = p -> System.out.println(p);

	/**
	 * classname::methodName
	 */
	static Consumer<Student> c2 = System.out::println;

	/**
	 * classname::instanceMethodName
	 */
	static Consumer<Student> c3 = Student::printListOfActivities;

	public static void main(String[] args) {
		StudentDataBase.getAllStudents().forEach(c2);
		StudentDataBase.getAllStudents().forEach(c3);
	}

}
