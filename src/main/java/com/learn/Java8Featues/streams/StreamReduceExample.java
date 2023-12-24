package com.learn.Java8Featues.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

/**
 * This is a terminal operation. Used to reduce the contents of a stream to a
 * single value.
 * 
 * @author tushar
 *
 */
public class StreamReduceExample {

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream()
				// 1
				// 3
				// 5
				// 7
				// a=1,b=1 (from stream) result 1
				// a=1,b=3 (from stream) result 3
				// a=3,b=5 (from stream) result 15
				// a=15,b=7 (from stream) result 105
				.reduce(1, (a, b) -> a * b);
	}

	public static Optional<Student> getHighestGPAStudent() {
		return StudentDataBase.getAllStudents().stream().reduce((s1, s2) -> {
			if (s1.getGpa() > s2.getGpa()) {
				return s1;
			} else {
				return s2;
			}
		});
	}

	public static void main(String[] args) {

		List<Integer> integerList = Arrays.asList(1, 3, 5, 7);

		System.out.println(performMultiplication(integerList));

		Optional<Student> studentOptional = getHighestGPAStudent();
		if (getHighestGPAStudent().isPresent()) {
			System.out.println(studentOptional.get());
		}

	}

}
