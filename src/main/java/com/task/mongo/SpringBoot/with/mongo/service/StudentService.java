package com.task.mongo.SpringBoot.with.mongo.service;

import java.util.List;

import com.task.mongo.SpringBoot.with.mongo.model.Student;

public interface StudentService {

	
     Student addStudent(Student student);
	
	 Student getStudentById(String studentId);
	
     List<Student> getAllStudentList();
     
     List<Student> getStudentByClass(String className);
     
     Student updateStudent(Student student);
	
     String deleteStudentById(String studentId);
}
