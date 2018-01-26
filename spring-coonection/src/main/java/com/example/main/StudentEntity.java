package com.example.main;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class StudentEntity {
	@Column
	private String name;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll;
	public StudentEntity(){
		
	}
	public void SetName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void SetRoll(int  roll)
	{
		this.roll=roll;
	}
	public int getRoll()
	{
		return roll;
	}
	
	

}
