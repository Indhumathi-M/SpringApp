package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PointsController {
	
	@Autowired 
	Points p;
	@RequestMapping(value="/addpoints/{team}/{points}")
	public String addPoints(@PathVariable("team") String team, @PathVariable("points") int points,PointsEntity pe)
	{
		pe.setTeam(team);
		pe.setPoint(points);
		if(points<=2){
			if(points==2)
			{
				p.addPoints(pe);
				return (team +" won the match");
			}
			else if(points==1)
			{
				p.addPoints(pe);
				return ("The match is draw");
			}
			else if(points==0)
			{
				p.addPoints(pe);
				return(team +" Lost the match");
			}
			else
				return("");
		}
		else
			return("Invalid point");
	}

}
