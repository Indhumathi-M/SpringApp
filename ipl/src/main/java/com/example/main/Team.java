package com.example.main;

public interface Team {

	 public int addPlayer(PlayerEntity pe);
	 public int addFour(PlayerEntity pe);
	 public int addSix(PlayerEntity pe);
	 public int addRun(PlayerEntity pe);
	 public int update(int jersy_no,PlayerEntity pe);
	 public int delete(int run,int jersyno,PlayerEntity pe);
}
