package com.avalith.GonzaloChallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Configuration
public class GonzaloChallengeApplication {

	public static void main(String[] args) {
		SpringApplication.run(GonzaloChallengeApplication.class, args);
	}

}
