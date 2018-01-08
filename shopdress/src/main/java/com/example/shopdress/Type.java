package com.example.shopdress;

import org.springframework.stereotype.Service;

@Service
public class Type {
	private int  id;
	private String name;
	private int  price;
	
	public Type()
	{
		
	}
	public Type(int id, String name,int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}