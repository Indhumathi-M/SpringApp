package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("SubjectEntity")
public class SubjectDao {
	
	@Autowired
	private JdbcTemplate template;  
	  
	public void setJdbcTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  

	public int add(SubjectEntity se) {
		 String sql="insert into subject"+"(roll,tamil,english,maths,marks)"+" values (?, ?, ?, ?, ?)";
		    return template.update(sql,se.getRoll(),se.getTamil(),se.getEnglish(),se.getMaths(),se.getMarks());  
		
	}

	public int update(SubjectEntity se) {
		String sql="UPDATE `subject` SET `tamil`=?,`english`=?,`maths`=?,`marks`=? WHERE `roll`=?";
	    return template.update(sql,se.getRoll(),se.getTamil(),se.getEnglish(),se.getMaths(),se.getMarks()); 
		
	}

}
