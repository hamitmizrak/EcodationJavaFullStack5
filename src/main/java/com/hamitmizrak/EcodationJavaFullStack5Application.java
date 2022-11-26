package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {
		SecurityAutoConfiguration.class
}
)
public class EcodationJavaFullStack5Application {

	public static void main(String[] args) {
		//System.setProperty("spring.devtools.restart.enabled","true");
		System.setProperty("java.awt.headless", "false"); //Disables headless
		SpringApplication.run(EcodationJavaFullStack5Application.class, args);
	}
}
