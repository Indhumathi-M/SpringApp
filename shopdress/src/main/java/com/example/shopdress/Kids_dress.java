package com.example.shopdress;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Kids_dress {
	List <Type> items_kids=new ArrayList<Type>(Arrays.asList(new Type(001,"western-frock",2000),
			new Type(002,"long-frock",3000),
			new Type(003,"trousars",5000),
			new Type(004,"T-shirt",2500),
			new Type(005,"jeans",1500)));
	public List<Type> getListOfItems_K() {
		// TODO Auto-generated method stub
		return items_kids;
	}
	public Type searchItems_K(int id)
	{
		Type ty = new Type();
		  for(int i=0; i<items_kids.size(); i++){
		   Type t = items_kids.get(i);
		   if(t.getId()==id){
		    ty = items_kids.get(i);
		   }  
		  } 
		  return ty;
	}
	public void addToCart_K(Type t) {
		// TODO Auto-generated method stub
		items_kids.add(t);
	}
	public void removeFromCart_K(int id) {
		// TODO Auto-generated method stub
		items_kids.remove(id);
	}
}
