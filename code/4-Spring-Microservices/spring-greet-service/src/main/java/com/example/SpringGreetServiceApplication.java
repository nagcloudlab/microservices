package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

import java.time.Duration;

@SpringBootApplication
@RestController
public class SpringGreetServiceApplication {

	@GetMapping
	public Mono<String> greet() {
		System.out.println("Accepting Request :" + Thread.currentThread());
		return Mono.just("Hello World").delayElement(Duration.ofSeconds(2));
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringGreetServiceApplication.class, args);
	}

}
