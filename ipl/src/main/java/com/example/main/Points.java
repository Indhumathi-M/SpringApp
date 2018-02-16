package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Points {

	@Autowired
	private JdbcTemplate template;  
	  
	public void setJdbcTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	public int addPoints(PointsEntity pe) {
		 String sql="UPDATE points SET point='"+pe.getPoint()+"' WHERE team='"+pe.getTeam()+"'";
		    return template.update(sql);
	}

}
