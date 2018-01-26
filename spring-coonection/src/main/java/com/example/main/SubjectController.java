package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class SubjectController {
	   	
		@Autowired 
		private SubjectDao sub;
		
		
		 @RequestMapping(value="/subject/{roll}/{tamil}/{english}/{maths}")  
		    public @ResponseBody String add(@PathVariable int roll,@PathVariable int tamil,@PathVariable int english,@PathVariable int maths,SubjectEntity se){  
			 	se.SetRoll(roll);
		        se.SetTamil(tamil);
		        se.SetEnglish(english);
		        se.SetMaths(maths);	    
		        int marks=se.getEnglish()+se.getMaths()+se.getTamil();
		        se.SetMarks(marks);
			 	sub.add(se);  
		        return ("subject added to your list");
		    }  
		
		 @RequestMapping(value="/updateSub/{roll}/{tamil}/{english}/{maths}")  
		    public @ResponseBody String update(@PathVariable int roll,@PathVariable int tamil,@PathVariable int english,@PathVariable int maths, SubjectEntity se){  
			    se.SetRoll(roll);
		        se.SetTamil(tamil);
		        se.SetEnglish(english);
		        se.SetMaths(maths);
		        int marks=se.getEnglish()+se.getMaths()+se.getTamil();
		        se.SetMarks(marks);
			 	sub.update(se);  
		        return ("subject is updated");  
		    }  
		 
		 


}
