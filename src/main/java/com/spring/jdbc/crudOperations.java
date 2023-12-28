package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entites.Student;
import java.util.*;

public class crudOperations {
	  Scanner scan = new Scanner(System.in);
	  ApplicationContext context = new AnnotationConfigApplicationContext(jdbcConfigJava.class);
      
      StudentDao studentDao= context.getBean("studentDao" , StudentDao.class);
	
      
      
	 public void insert() {
		
      Student student = new Student();
      System.out.println("enter the student id :");
      int id = scan.nextInt();
      student.setId(id);
      System.out.println("enter the student name");
      String name = scan.next();
      student.setName(name);
      System.out.println("enter city name ");
      String city = scan.next();
      student.setCity(city);
      
      int res = studentDao.insert(student);
      
      System.out.println("student addded" + res);
      
	}
	 
	 
	 
	 public void update() {
	       // updating data 
	  System.out.println("enter the id to be updated "); 
	  int id = scan.nextInt();
      Student student = new Student();
    
     
       student.setId(id);
     
       System.out.println("enter name ");
       String name = scan.next();
       student.setName(name);
       System.out.println("enter the city name");
       String city = scan.next();
       student.setCity(city);
       
       int res = studentDao.change(student);
       if(res > 0) {
    	   System.out.println("data updated in databse ");
       }
  
	 }
	
	
	
	
	
	public void deleteTheRowFromId() {
		
      System.out.println("enter the student id for deleting");
      int n = scan.nextInt();
     // delete row from student id 
     int result = studentDao.remove(n);
     if(result > 0) {
  	   System.out.println("data deleted ");
     }

	}
	
	
	public void getOneStudent() {
	
	 System.out.println("enter the id to get student details");
	 int id = scan.nextInt();
     Student studentIget = studentDao.getStudent(id);
     System.out.println(studentIget);
	
	}
	
	
	
	
	public void getAllTheStudents() {
		
      List<Student> student = studentDao.getAllStudent();
      for(Student s : student) {
   	   System.out.println(s);
      }
  
	}
	
	
	
	public void deleteAllStudents() {
		studentDao.deleteAll();
	}
	
	

}
