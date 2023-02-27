package com.seniorproject.Backend;

import com.seniorproject.Backend.entities.User;
import com.seniorproject.Backend.services.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);

	}


	@Override
	public void run(String... args) throws Exception {
		//User users = userService.getUserById(2);
		//users.toString();
		System.out.println("test");
		User testuser = new User(6,"dave","username","939842",0,40,"lunch","math",3,4);
		userService.createUser(testuser);
	}

	private void createAccount(User user){
		userService.createUser(user);
	}


//	public void run(String... args) throws Exception
//	{
//		List<User> userlist = userService.getAllUsers();
//		System.out.println(userlist);
//		System.out.println("This works");
//	}



//	private void test(){
//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("get users?");
//		String answer = scanner.nextLine();
//		if (answer == "y"){
//			List<User> userlist = userService.getAllUsers();
//			if (userlist.isEmpty()){
//				System.out.println("Empty");
//			}else {
//				System.out.println(Arrays.toString(userlist.toArray()));
//				System.out.println("This works");
//			}
//		}
//	}

}
