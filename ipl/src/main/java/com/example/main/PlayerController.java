package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerController {
	@Autowired
	Chennai c;
	
	@Autowired
	Kolkatta k;
	@Autowired
	Bangalore b;
	@Autowired
	Mumbai m;
	
	@RequestMapping(value="/addPlayer/{team}/{name}/{jersyno}")
	public void addPlayer(@PathVariable("team") String team,@PathVariable("name") String name,@PathVariable("jersyno")int jersyno,PlayerEntity pe)
	{
		pe.setName(name);
		pe.setTeam(team);
		pe.setNum(jersyno);
		if(team.equals("chennai"))
		{
			c.addPlayer(pe);
		}
		else if(team.equals("mumbai"))
		{
			m.addPlayer(pe);
		}
		else if(team.equals("kolkatta"))
		{
			k.addPlayer(pe);
		}
		else if(team.equals("bangalore"))
		{
			b.addPlayer(pe);
		}
	}
	@RequestMapping(value="/addFour/{team}/{jersyno}/{four}")
	public void addFour(@PathVariable("team") String team,@PathVariable("jersyno")int jersyno,@PathVariable("four")int four,PlayerEntity pe)
	{
		pe.setTeam(team);
		pe.setNum(jersyno);
		int f=four*4;
		pe.setFour(f);
		if(team.equals("chennai"))
		{
			c.addFour(pe);
		}
		else if(team.equals("mumbai"))
		{
			m.addFour(pe);
		}
		else if(team.equals("kolkatta"))
		{
			k.addFour(pe);
		}
		else if(team.equals("bangalore"))
		{
			b.addFour(pe);
		}
	}
	@RequestMapping(value="/addSix/{team}/{jersyno}/{six}")
	public void addSix(@PathVariable("team") String team,@PathVariable("jersyno")int jersyno,@PathVariable("six")int six,PlayerEntity pe)
	{
		pe.setTeam(team);
		pe.setNum(jersyno);
		int s=six*6;
		pe.setSix(s);
		if(team.equals("chennai"))
		{
			c.addSix(pe);
		}
		else if(team.equals("mumbai"))
		{
			m.addSix(pe);
		}
		else if(team.equals("kolkatta"))
		{
			k.addSix(pe);
		}
		else if(team.equals("bangalore"))
		{
			b.addSix(pe);
		}
	}
	@RequestMapping(value="/addRuns/{team}/{jersyno}/{runs}")
	public void addRuns(@PathVariable("team") String team,@PathVariable("jersyno")int jersyno,@PathVariable("runs")int runs,PlayerEntity pe)
	{
		pe.setTeam(team);
		pe.setNum(jersyno);
		pe.setRun(runs);
		if(team.equals("chennai"))
		{
			c.addRun(pe);
		}
		else if(team.equals("mumbai"))
		{
			m.addRun(pe);
		}
		else if(team.equals("kolkatta"))
		{
			k.addRun(pe);
		}
		else if(team.equals("bangalore"))
		{
			b.addRun(pe);
		}
	}
	@RequestMapping(value="/update/{team}/{jersyno}")
	public void update(@PathVariable("team") String team,@PathVariable("jersyno")int jersyno,PlayerEntity pe)
	{
		pe.setTeam(team);
		pe.setNum(jersyno);
		if(team.equals("chennai"))
		{
			c.update(jersyno,pe);
		}
		else if(team.equals("mumbai"))
		{
			m.update(jersyno,pe);
		}
		else if(team.equals("kolkatta"))
		{
			k.update(jersyno,pe);
		}
		else if(team.equals("bangalore"))
		{
			b.update(jersyno,pe);
		}
	}
	@RequestMapping(value="/delete/{team}/{jersyno}/{runs}")
	public void delete(@PathVariable("team") String team,@PathVariable("jersyno")int jersyno,@PathVariable("runs")int run,PlayerEntity pe)
	{
		pe.setTeam(team);
		pe.setNum(jersyno);
		
		if(team.equals("chennai"))
		{
			c.delete(run,jersyno,pe);	
		}
		else if(team.equals("mumbai"))
		{
			m.delete(run,jersyno,pe);
		}
		else if(team.equals("kolkatta"))
		{
			k.delete(run,jersyno,pe);
		}
		else if(team.equals("bangalore"))
		{
			b.delete(run,jersyno,pe);
		}
	}


}
