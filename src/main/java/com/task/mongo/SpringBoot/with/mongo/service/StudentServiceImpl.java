package com.task.mongo.SpringBoot.with.mongo.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.mongo.SpringBoot.with.mongo.Dao.StudentDao;
import com.task.mongo.SpringBoot.with.mongo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {
		student.setsId(UUID.randomUUID().toString());
		return studentDao.save(student);
	}

	@Override
	public Student getStudentById(String studentId) {
		
		return studentDao.findById(studentId).orElse(null);
	}

	@Override
	public List<Student> getAllStudentList() {
		
		return studentDao.findAll();
	}

	@Override
	public List<Student> getStudentByClass(String className) {
	
		return studentDao.findStudentBySClass(className);
	}

	@Override
	public Student updateStudent(Student student) {
		Student existStudent = studentDao.findById(student.getsId()).get();
		  if(null !=existStudent) {
			  existStudent.setsName(student+"Test");
			  
			  return studentDao.save(existStudent);
		  }
			  
		return null;
	}

	@Override
	public String deleteStudentById(String studentId) {
		// TODO Auto-generated method stub
	     studentDao.deleteById(studentId);
	 return "Delete Student SuccessFul";
	}

}
