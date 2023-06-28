package com.learnJava.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Duck or Croutch");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Fire Bullets");
	}
}
