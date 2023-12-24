package com.learn.Java8Featues.streams;

import com.learn.Java8Featues.data.Student;
import com.learn.Java8Featues.data.StudentDataBase;

public class StreamMapReduceExample {

	public static int noOfNoteBooks() {
		return StudentDataBase.getAllStudents().stream().map(Student::getNoteBooks).reduce(0, (a, b) -> a + b);
	}

	public static void main(String[] args) {
		System.out.println(noOfNoteBooks());
	}

}
