package com.example.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chennai")
public class PlayerEntity {
	
	private String team;
	@Column
	private String name;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int jersy_no;
	@Column
	private int run;
	@Column
	private int four;
	@Column
	private int six;
	@Column
	private int total;
	
	public PlayerEntity()
	{
		
	}
	public PlayerEntity(String team,String name,int jersy_no,int run,int four,int six)
	{
		this.team=team;
		this.name=name;
		this.jersy_no=jersy_no;
		this.four=four;
		this.six=six;
		
	}
	public void setTeam(String team)
	{
		this.team=team;
	}
	public String getTeam()
	{
		return team;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setNum(int jersy_no)
	{
		this.jersy_no=jersy_no;
	}
	public int getNum()
	{
		return jersy_no;
	}
	public void setRun(int run)
	{
		this.run=run;
	}
	public int getRun()
	{
		return run;
	}
	public void setFour(int four)
	{
		this.four=four;
	}
	public int getFour()
	{
		return four;
	}
	public void setSix(int six)
	{
		this.six=six;
	}
	public int getSix()
	{
		return six;
	}
	public void setTotal(int total)
	{
		this.total=total;
	}
	public int getTotal()
	{
		return total;
	}
	

}
