package com.example.main;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="points")
public class PointsEntity {
	@Id
	@Column
	private String team;
	@Column
	private int points;
	
	public void setTeam(String team)
	{
		this.team=team;
	}
	public String getTeam()
	{
		return team;
	}
	public void setPoint(int points)
	{
		this.points=points;
	}
	public int getPoint()
	{
		return points;
	}
}
