package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class
}
)
public class EcodationJavaFullStack5Application {

	//Spring Constructor
	@PostConstruct
	public void init(){
		TimeZone.setDefault(TimeZone.getTimeZone("IST"));
	}

	public static void main(String[] args) {
		System.setProperty("spring.devtools.restart.enabled","true");
		//Disables headless
		System.setProperty("java.awt.headless", "false");
		SpringApplication.run(EcodationJavaFullStack5Application.class, args);
	}
}
