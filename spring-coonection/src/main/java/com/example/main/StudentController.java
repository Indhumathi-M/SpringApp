package com.example.main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class StudentController {
	@Autowired 
	private StudentDao stu;
	 
	
	    @RequestMapping(value="/studentdetails/{name}/{roll}")  
	    public  String addStudent(@PathVariable("name") String name, @PathVariable("roll") int roll,StudentEntity s ){
	    	s.SetName(name);
	    	s.SetRoll(roll);
		 	stu.add(s);  
	        return ("Student detail added successfully");
	    }  
	    
	
	 @RequestMapping(value="/updateStudentDetail/{name}/{roll}")  
	    public @ResponseBody String updateStudent (@PathVariable("name") String name,@PathVariable int roll, StudentEntity se){ 
		 		se.SetName(name);
	    	    se.SetRoll(roll);
	    		stu.update(se);  
	    		return ("List is updated");
	    	
	    }  
	 
	  @RequestMapping(value="/delete/{roll}",method = RequestMethod.GET)  
	    public String delete(@PathVariable("roll") int roll){  
	        stu.delete(roll);  
	        return ("Deleted");  
	  }
		
}
