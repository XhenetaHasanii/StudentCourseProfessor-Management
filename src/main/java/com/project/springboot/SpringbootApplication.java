package com.project.springboot;

import com.project.springboot.professor.Professor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
		System.out.println("Hello World");
		Professor professor=new Professor();


	}

}
