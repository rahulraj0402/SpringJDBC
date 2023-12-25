package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	System.out.println("program started");
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
       JdbcTemplate templete= (JdbcTemplate) context.getBean("jdbcTemplate");
      
     
       // insert the query 
       String query = "insert into student(id,name,city) values(? , ? , ?)";
       
       // fire the query 
       // since templete.update returns a integer value ( 1 rows affected )
       int result = templete.update(query,104,"Sivang","dhanbad");
       System.out.println("number of record inserted " + result);
       
       
       
       
       
    }
}
