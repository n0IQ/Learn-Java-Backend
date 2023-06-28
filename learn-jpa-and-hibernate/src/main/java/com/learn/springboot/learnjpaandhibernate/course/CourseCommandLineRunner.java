package com.learn.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.learn.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseJdbcRepository repository;

//	@Autowired
//	private CourseJpaRepository repository;

	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * repository.insert(new Course(1, "Learn Spring Boot", "Udemy"));
		 * repository.insert(new Course(2, "Learn AWS", "Youtube"));
		 * repository.insert(new Course(3, "Learn Java", "Udemy"));
		 * 
		 * repository.deleteById(3);
		 * 
		 * System.out.println(repository.findById(1));
		 * System.out.println(repository.findById(2));
		 */

		System.out.println("Saving Data...");
		repository.save(new Course(1, "Learn Spring Boot", "Udemy"));
		repository.save(new Course(2, "Learn AWS", "Youtube"));
		repository.save(new Course(3, "Learn Java", "Udemy"));

		repository.deleteById(3l);

		System.out.println("Finding Data By ID...");
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(2l));
		
		System.out.println("Find All Data...");
		System.out.println(repository.findAll());
		System.out.println(repository.count());
		
		System.out.println("Find Data by Author...");
		System.out.println(repository.findByAuthor("Udemy"));
		System.out.println(repository.findByAuthor(""));
		
		System.out.println("Find Data By Name...");
		System.out.println(repository.findByName("Learn Spring Boot"));
		System.out.println(repository.findByName(""));
	}
}
