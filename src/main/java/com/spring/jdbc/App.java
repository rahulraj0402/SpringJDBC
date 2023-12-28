package com.spring.jdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	System.out.println("program started");

    	crudOperations cd = new crudOperations();

//    	cd.insert();
//    	cd.update();
//    	cd.deleteTheRowFromId();
//    	cd.getOneStudent();
//      
//    	cd.deleteAllStudents();
    	
    	while(true) {
    	 	cd.insert();
    	 	cd.getAllTheStudents();

    	}
    	
    	
   
       
    }
}








