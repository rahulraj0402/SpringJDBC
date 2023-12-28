package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.entites.Student;

public interface StudentDao {
	
	public int insert(Student student);
	
	public int change(Student student);
	
	public int remove(int studentId);
	
	public Student getStudent(int i);
	
	public List<Student> getAllStudent();
	
	public void deleteAll();
		
}
