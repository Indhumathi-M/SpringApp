package com.example.shopdress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Men_dress {
	List <Type> items_men=new ArrayList<Type>(Arrays.asList(new Type(001,"Foraml_shirt",2000),
			new Type(002,"pants",3000),
			new Type(003,"Dhothi",5000),
			new Type(004,"T-shirt",2500),
			new Type(005,"jeans",1500)));
	public List<Type> getListOfItems_M() {
		// TODO Auto-generated method stub
		return items_men;
	}
	public Type searchItems_M(int id)
	{
		Type ty = new Type();
		  for(int i=0; i<items_men.size(); i++){
		   Type t = items_men.get(i);
		   if(t.getId()==id){
		    ty = items_men.get(i);
		   }  
		  } 
		  return ty;
	}
	public void addToCart_M(Type t) {
		// TODO Auto-generated method stub
		items_men.add(t);
	}
	public void removeFromCart_M(int id) {
		// TODO Auto-generated method stub
		items_men.remove(id);
	}
}

