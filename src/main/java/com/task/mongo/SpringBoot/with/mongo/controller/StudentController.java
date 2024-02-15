package com.task.mongo.SpringBoot.with.mongo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.task.mongo.SpringBoot.with.mongo.model.Student;
import com.task.mongo.SpringBoot.with.mongo.service.StudentService;

@RestController
@RequestMapping("student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	@ResponseStatus(code = HttpStatus.OK)
	public Student addStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
		
	}
	
	@GetMapping("/id/{studentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public Student getStudentById(@PathVariable("studentId") String sId) {
		return studentService.getStudentById(sId);
		
	}
	
	@GetMapping("/")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Student> getAllStudent() {
		return studentService.getAllStudentList();
		
	}
	
	@GetMapping("/get")
	@ResponseStatus(code = HttpStatus.OK)
	public List<Student> getStudentByClass(@RequestParam("sClass") String className) {
		return studentService.getStudentByClass(className);
		
	}
	
	@PutMapping("/update")
	@ResponseStatus(code = HttpStatus.OK)
	public Student updateStudent(@RequestBody Student student) {
		return studentService.addStudent(student);
		
	}
	@DeleteMapping("/id/{studentId}")
	@ResponseStatus(code = HttpStatus.OK)
	public String deleteStudentById(@PathVariable("studentId") String sId) {
		return studentService.deleteStudentById(sId);
		
	}
	

}
