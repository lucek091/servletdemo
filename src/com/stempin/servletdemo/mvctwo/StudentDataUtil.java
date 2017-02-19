package com.stempin.servletdemo.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents(){
		
		List<Student> students=new ArrayList<>();
		
		students.add(new Student("Lukasz", "Stempin", "lucek091@gmail.com"));
		students.add(new Student("Katarzyna", "Kopko", "katarzyna.kopko@gmail.com"));
		students.add(new Student("Mariusz", "Pudzianowski", "pudzianmistrz@gmail.com"));
		
		return students;

	}

}
