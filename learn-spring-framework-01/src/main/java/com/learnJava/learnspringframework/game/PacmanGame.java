package com.learnJava.learnspringframework.game;

public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("Move Up");
	}
	
	public void down() {
		System.out.println("Move Down");
	}
	
	public void left() {
		System.out.println("Move Left");
	}
	
	public void right() {
		System.out.println("Move Right");
	}
}
