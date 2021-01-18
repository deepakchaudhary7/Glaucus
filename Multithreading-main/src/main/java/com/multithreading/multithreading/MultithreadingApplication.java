package com.multithreading.multithreading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class MultithreadingApplication {

	public static void main(String[] args) {
		System.out.println("nside main Thread:"+ Thread.currentThread());
		SpringApplication.run(MultithreadingApplication.class, args);
	}

}
