package com.learnJava.learnspringframework.examples.h1;


import java.util.Arrays;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learnJava.learnspringframework.game.GameRunner;

public class XmlConfigurationContextApplicationLauncher {
	public static void main(String[] args) {
		try(var context = new ClassPathXmlApplicationContext("contextConfiguration.xml")) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			
			context.getBean(GameRunner.class).run();
		}
	}
}
