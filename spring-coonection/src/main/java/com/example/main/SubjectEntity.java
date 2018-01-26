package com.example.main;

import javax.persistence.*;

@Entity
@Table(name="subject")
public class SubjectEntity {
	@Column
	private int tamil;
	@Column
	private int english;
	@Column
	private int maths;
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roll_no;
	@Column
	private int marks;
	public SubjectEntity()
	{
		
	}
	public void SetRoll(int  roll_no)
	{
		this.roll_no=roll_no;
	}
	public int getRoll()
	{
		return roll_no;
	}
	public void SetTamil(int  tamil)
	{
		this.tamil=tamil;
	}
	public int getTamil()
	{
		return tamil;
	}
	public void SetEnglish(int  english)
	{
		this.english=english;
	}
	public int getEnglish()
	{
		return english;
	}
	public void SetMaths(int  maths)
	{
		this.maths=maths;
	}
	public int getMaths()
	{
		return maths;
	}
	public void SetMarks(int  marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}

}
