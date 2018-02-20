package com.example.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class KolkattaRanking implements TeamRanking{
List <PlayerEntity> p=new ArrayList<PlayerEntity>(Arrays.asList(new PlayerEntity("Kolkatta","Goutam",13,4,6,50)));
	
	@Autowired
	private JdbcTemplate template;  
	  
	public void setJdbcTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public void six()
	{
		 List l = template.queryForList("select name from kolkatta order by six ");
		 Iterator it = l.iterator();
		 while(it.hasNext())
		 {
		 Object o = it.next();
		 System.out.println(o.toString());
		 }
		  
	}
	public void four()
	{
		 List l = template.queryForList("select name from kolkatta order by four ");
		 Iterator it = l.iterator();
		 while(it.hasNext())
		 {
		 Object o = it.next();
		 System.out.println(o.toString());
		 }
		
	}
	public void runs()
	{
		 List l = template.queryForList("select name from kolkatta order by run");
		 Iterator it = l.iterator();
		 while(it.hasNext())
		 {
		 Object o = it.next();
		 System.out.println(o.toString());
		 }
		 //return template.queryForObject("SELECT COUNT(0) FROM " + tableName, Integer.class); 
	}
	

}
