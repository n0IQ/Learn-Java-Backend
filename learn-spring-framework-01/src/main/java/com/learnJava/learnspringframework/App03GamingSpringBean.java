package com.learnJava.learnspringframework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.learnJava.learnspringframework.game.GameRunner;
import com.learnJava.learnspringframework.game.GamingConsole;

public class App03GamingSpringBean {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
		}
	}
}
