package com.example.shopdress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Women_dress {
	List <Type> items_women=new ArrayList<Type>(Arrays.asList(new Type(001,"saree",2000),
			new Type(002,"salwar",3000),
			new Type(003,"partty_ware",5000),
			new Type(004,"skirts",2500),
			new Type(005,"jeans",1500)));
	public List<Type> getListOfItems_W() {
		// TODO Auto-generated method stub
		return items_women;
	}
	public Type searchItems_W(int id)
	{
		Type ty = new Type();
		  for(int i=0; i<items_women.size(); i++){
		   Type t = items_women.get(i);
		   if(t.getId()==id){
		    ty = items_women.get(i);
		   }  
		  } 
		  return ty;
	}
	public void addToCart_W(Type t) {
		// TODO Auto-generated method stub
		items_women.add(t);
	}
	public void removeFromCart_W(int id) {
		// TODO Auto-generated method stub
		items_women.remove(id);
	}
}
