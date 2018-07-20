package com.test.cron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@EnableScheduling
@ComponentScan({ "com.test.cron" })
@RestController
public class App {
	
	 public static void main(String[] args) {
	        SpringApplication.run(new Object[] { App.class }, args);
	    }


}
