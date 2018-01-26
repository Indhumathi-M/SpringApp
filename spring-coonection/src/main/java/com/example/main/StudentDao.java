package com.example.main;
import java.sql.ResultSet;  
import java.sql.SQLException;   
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;   
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Statement;


@Repository("StudentEntity")
public class StudentDao { 
		  
		@Autowired
		private JdbcTemplate template;
		public void setJdbcTemplate(JdbcTemplate template) {  
		    this.template = template;  
		}  
		public int add(StudentEntity se){  
		    String sql="insert into student"+"(roll,name)"+" values (?, ?)";
		    return template.update(sql,se.getRoll(),se.getName());  
		}  
		
		public int update(StudentEntity se){
			 String sql="UPDATE `student` SET `name`=? WHERE `roll`=?";
			 return template.update(sql,se.getName(),se.getRoll());
		}  
		
		public int delete(int roll){  
		    String sql="delete from student where roll="+roll+"";  
		    return template.update(sql);  
		}
		 
		
	}  


