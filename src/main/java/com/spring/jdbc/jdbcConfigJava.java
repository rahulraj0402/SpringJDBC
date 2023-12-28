package com.spring.jdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entites.Student;

@Configuration
public class jdbcConfigJava {
	
	@Bean("ds")
	public DataSource getDataSource(){
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
		ds.setUsername("root");
		ds.setPassword("Rahu@7879");		
		return ds;
	}
	
	
	
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplete() {
		
		JdbcTemplate jdbcTemplete = new JdbcTemplate();
		jdbcTemplete.setDataSource(getDataSource());
		
		return jdbcTemplete;
	}
		
	
	
	@Bean("studentDao")
	public StudentDao getStudentDao() {
		
		StudentDaoImpl daoImpl = new StudentDaoImpl();
		daoImpl.setJdbcTemplate(getTemplete());
		return daoImpl;
	}
	
	

}










