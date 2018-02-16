package com.example.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class RankingController {
	
	@Autowired
	private ChennaiRanking cr;
	@Autowired
	private MumbaiRanking mr;
	@Autowired
	private BangaloreRanking br;
	@Autowired
	private KolkattaRanking kr;
	
	
	@RequestMapping(value="/PlayerNamesInTotalNumberOfSix/{team}")
	public void six(@PathVariable("team") String team,PlayerEntity pe)
	{
		if(team.equals("chennai"))
		{
			cr.six();
		}
		else if(team.equals("mumbai"))
		{
			mr.six();
		}
		else if(team.equals("kolkatta"))
		{
			kr.six();
		}
		else if(team.equals("bangalore"))
		{
			br.six();
		}
		
	}
	@RequestMapping(value="/PlayerNamesInTotalNumberOfFour/{team}")
	public void four(@PathVariable("team") String team,PlayerEntity pe)
	{
		if(team.equals("chennai"))
		{
			cr.six();
		}
		else if(team.equals("mumbai"))
		{
			mr.six();
		}
		else if(team.equals("kolkatta"))
		{
			kr.six();
		}
		else if(team.equals("bangalore"))
		{
			br.six();
		}
		
	}
	@RequestMapping(value="/PlayerNamesInTotalNumberOfRun/{team}")
	public void runs(@PathVariable("team") String team,PlayerEntity pe)
	{
		if(team.equals("chennai"))
		{
			cr.runs();
		}
		else if(team.equals("mumbai"))
		{
			mr.runs();
		}
		else if(team.equals("kolkatta"))
		{
			kr.runs();
		}
		else if(team.equals("bangalore"))
		{
			br.runs();
		}
		
	}

}
