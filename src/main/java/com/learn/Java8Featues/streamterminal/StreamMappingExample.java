package com.learn.Java8Featues.streamterminal;

import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toSet;

import java.util.List;
import java.util.Set;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class StreamMappingExample {

	public static void main(String[] args) {

		List<String> nameList = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName, toList()));

		System.out.println("namesList : " + nameList);

		Set<String> namesSet = StudentDataBase.getAllStudents().stream().collect(mapping(Student::getName, toSet()));

		System.out.println("namesSet : " + namesSet);

	}

}
