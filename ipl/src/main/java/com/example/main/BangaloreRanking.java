package com.example.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class BangaloreRanking {
List <PlayerEntity> p=new ArrayList<PlayerEntity>(Arrays.asList(new PlayerEntity("Bangalore","kohli",18,4,6,50)));
	
	@Autowired
	private JdbcTemplate template;  
	  
	public void setJdbcTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public void six()
	{
		 List l = template.queryForList("select name from banalore order by six ");
		 Iterator it = l.iterator();
		 while(it.hasNext())
		 {
		 Object o = it.next();
		 System.out.println(o.toString());
		 }
		
	}
	public void four()
	{
		 List l = template.queryForList("select name from bangalore order by four ");
		 Iterator it = l.iterator();
		 while(it.hasNext())
		 {
		 Object o = it.next();
		 System.out.println(o.toString());
		 }
		
	}
	public void runs()
	{
		 List l = template.queryForList("select name from bangalore order by run");
		 Iterator it = l.iterator();
		 while(it.hasNext())
		 {
		 Object o = it.next();
		 System.out.println(o.toString());
		 }
		 
	}
	

}
