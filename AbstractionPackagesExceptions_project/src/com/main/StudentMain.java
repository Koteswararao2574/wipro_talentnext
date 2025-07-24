package com.main;
import com.bean.*;
import com.exception.*;
import com.Service.*;
public class StudentMain {
	static Student data[] = new Student[4];
	static {
		data[0] = new Student("Sekar", new int[] { 85, 75, 95 }, null);
		data[1] = new Student(null, new int[] { 11, 22, 33 }, null);
		data[2] = null;
		data[3] = new Student("Manoj", null, null);

	}

	public static void main(String[] args) {
		StudentReport sr = new StudentReport();
		StudentService ss = new StudentService();

		for (int i = 0; i < data.length; i++) {
			try {
				String result = sr.validate(data[i]);
				if (result.equals("VALID")) {
					String grade = sr.findGrades(data[i]);
					System.out.println("Grade: " + grade);
				}
			} catch (NullNameException | NullMarksArrayException | NullStudentObjectException e) {
				e.printStackTrace();
			}
		}

		System.out.println("Number of Null Names: " + ss.findNumberOfNullName(data));
		System.out.println("Number of Null Marks: " + ss.findNumberOfNullMarksArray(data));
		System.out.println("Number of Null Objects: " + ss.findNumberOfNullObjects(data));

	}
}
