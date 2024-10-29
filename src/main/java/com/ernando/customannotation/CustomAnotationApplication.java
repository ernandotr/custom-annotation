package com.ernando.customannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomAnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomAnotationApplication.class, args);

//		IntStream.range(0,20).mapToDouble(i -> (double) i).forEach(System.out::println);
	}

}
