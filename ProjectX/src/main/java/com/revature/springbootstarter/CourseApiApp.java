package com.revature.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//register as the main spring app
@SpringBootApplication
public class CourseApiApp {

	// spring doesn't need a servlet container
	public static void main(String[] args) {

		// **static** runs a (class, main method args)
		SpringApplication.run(CourseApiApp.class, args);
	}

}
