package com.seniorproject.Backend;

import com.seniorproject.Backend.entities.User;
import com.seniorproject.Backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("Hopefully this works");
		};
	}
	@Autowired
	private UserService userService;

	public void run(String... args) throws Exception
	{
		List<User> userlist = userService.getAllUsers();
		System.out.println(userlist);
		System.out.println("This works");
	}

}
