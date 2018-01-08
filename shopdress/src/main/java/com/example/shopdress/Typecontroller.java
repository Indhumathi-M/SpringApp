package com.example.shopdress;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Typecontroller {
		@Autowired
		private Type t;
		@Autowired
		private Kids_dress k;
		
		@Autowired
		private Men_dress m;
		
		@Autowired
		private Women_dress w;
		
		
		@RequestMapping(value={"", "/kids"})
		public List<Type> getListOfItems_K(){
			return k.getListOfItems_K();
		}

		@RequestMapping(value={"", "/men"})
		public List<Type> getListOfItems_M(){
			return m.getListOfItems_M();
		}

		@RequestMapping(value={"", "/women"})
		public List<Type> getListOfItems_W(){
			return w.getListOfItems_W();
		}

		
		@RequestMapping("/kids/{id}")
		public Type searchItems_K(@PathVariable int id)
		{
			return k.searchItems_K(id);
		}
		@RequestMapping("/men/{id}")
		public Type searchItems_M(@PathVariable int id)
		{
			return m.searchItems_M(id);
		}
		@RequestMapping("/women/{id}")
		public Type searchItems_W(@PathVariable int id)
		{
			return w.searchItems_W(id);
		}
		@RequestMapping(method=RequestMethod.POST,value="/kids")
		public void addToCart_K(@RequestBody Type t)
		{
			k.addToCart_K(t);
		}
		@RequestMapping(method=RequestMethod.POST,value="/men")
		public void addToCart_M(@RequestBody Type t)
		{
			m.addToCart_M(t);
		}
		@RequestMapping(method=RequestMethod.POST,value="/women")
		public void addToCart_W(@RequestBody Type t)
		{
			w.addToCart_W(t);
		}
		
		@RequestMapping(method=RequestMethod.DELETE,value="/kids{id}")
		public void removeFromCart_K(@PathVariable int id)
		{
			k.removeFromCart_K(id);
		}
		@RequestMapping(method=RequestMethod.DELETE,value="/men{id}")
		public void removeFromCart_M(@PathVariable int id)
		{
			m.removeFromCart_M(id);
		}
		@RequestMapping(method=RequestMethod.DELETE,value="/women{id}")
		public void removeFromCart_W(@PathVariable int id)
		{
			w.removeFromCart_W(id);
		}
	
}
