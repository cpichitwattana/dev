package com.demo.springboot.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootApplicationLuncher {
public static void main(String[] args) {
SpringApplication.run(HelloWorldController.class, args);
}
}