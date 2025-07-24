package com.Service;
import com.bean.*;
import com.exception.*;
public class StudentReport {
	public String findGrades(Student studentObject) {
		int[] marks = studentObject.getMarks();
		int sum = 0;
		for(int i=0;i<marks.length;i++) {
			if (marks[i] < 35) {
				studentObject.setGrade("F");
				return "F"; 
			}
				
			sum += marks[i];
		}
		String grade = (sum < 150)?"C":(sum < 200)?"B":(sum < 250)?"A":"A+";
		studentObject.setGrade(grade);
		return grade;
		
	}
	
	public String validate(Student s) throws NullMarksArrayException, NullNameException, NullStudentObjectException
	{
		if(s == null) throw new NullStudentObjectException();
		if(s.getName() == null) throw new NullNameException();
		if(s.getMarks() == null) throw new NullMarksArrayException();
		return "VALID";
	}
}
