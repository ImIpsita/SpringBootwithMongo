package com.task.mongo.SpringBoot.with.mongo.Dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.task.mongo.SpringBoot.with.mongo.model.Student;

public interface StudentDao extends MongoRepository<Student, String>{
	
	@Query("select a from Student a where sClass :=className")
	List<Student> findStudentBySClass(String className);

}
