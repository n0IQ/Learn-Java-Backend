package com.learnJava.learnspringframework.examples.c1;


import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.core.net.SyslogOutputStream;

@Configuration
@ComponentScan
public class RealWorldSimpleStringContextApplicationLauncher {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(RealWorldSimpleStringContextApplicationLauncher.class)) {
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(BusinessCalculationService.class).findMax());
		}
	}
}
