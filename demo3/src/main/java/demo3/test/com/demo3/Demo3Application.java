package demo3.test.com.demo3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import demo3.test.com.demo3.run.Run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class Demo3Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
		//final Logger logger = LoggerFactory.getLogger(Demo3Application.class);
	}

	@Bean
	CommandLineRunner run() {
		final Logger logger = LoggerFactory.getLogger(Demo3Application.class);
		return args -> {
			logger.info("Running tests...");
			Run run = new Run(1, "x", "y", "password", "role", "status", "created_at", "updated_at");
			logger.info(run.toString());
		};
	}

}
