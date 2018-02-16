package com.example.main;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class Chennai {
	@Autowired
	private JdbcTemplate template;  
	  
	public void setJdbcTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	
	public int addPlayer(PlayerEntity pe)
	{
		 String sql="insert into chennai"+"(name,jersy_no)"+" values (?, ?)";
		    return template.update(sql,pe.getName(),pe.getNum());
	}
	
	public int addFour(PlayerEntity pe)
	{
		 String sql="UPDATE chennai SET four=?  WHERE jersy_no =?";
		 return template.update(sql,pe.getFour(),pe.getNum());
	}
	
	public int addSix(PlayerEntity pe)
	{
		 String sql="UPDATE chennai SET six=? WHERE jersy_no=?";
		    return template.update(sql,pe.getSix(),pe.getNum());
	}
	
	public int addRun(PlayerEntity pe)
	{
		 String sql="UPDATE chennai SET runs=? WHERE jersy_no=?";
		    return template.update(sql,pe.getRun(),pe.getNum());
	}
	public int update(int jersy_no,PlayerEntity pe)
	{
		String sql="update chennai set total=four+six+runs where jersy_no=?";
		return template.update(sql,pe.getNum());
	}
	public int delete(int run,int jersyno,PlayerEntity pe){ 
		
				String sql="UPDATE chennai SET total=total-'"+run+"'WHERE jersy_no=?";  
			    return template.update(sql,pe.getNum()); 
			     
	}
	

}
