package com.learnJava.learnspringframework.examples.d1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization Logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationApplicationLauncher {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationApplicationLauncher.class)) {
			System.out.println("Initialization is Completed");
			
			context.getBean(ClassB.class).doSomething();
		}
	}
}
