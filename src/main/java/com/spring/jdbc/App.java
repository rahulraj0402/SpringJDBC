package com.spring.jdbc;

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
    	 Scanner scan = new Scanner(System.in);
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
      
       StudentDao studentDao= context.getBean("studentDao" , StudentDao.class);
       
      // inserting the data 
//       
      
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
       
       
       
       // updating data 
//       Student student = new Student();
//       student.setId(103);
//       student.setName("isha kedia");
//       student.setCity("bihar");
//       
//       int res = studentDao.change(student);
//       if(res > 0) {
//    	   System.out.println("data updated in databse ");
//       }
       
       
      
       System.out.println("enter the student id for deleting");
       int n = scan.nextInt();
       // delete row from student id 
       int result = studentDao.remove(n);
       if(result > 0) {
    	   System.out.println("data deleted ");
       }
       
       
    }
}
