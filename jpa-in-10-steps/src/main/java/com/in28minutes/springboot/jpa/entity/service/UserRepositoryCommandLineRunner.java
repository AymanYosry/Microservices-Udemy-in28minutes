/**
 * 
 */
package com.in28minutes.springboot.jpa.entity.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.jpa.entity.User;

/**
 * @author ayosry
 *
 */
@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner
{
	private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception
	{
		for (int i = 1; i <= 5; i++)
		{
			User user = new User("Ayman" + i, "Role" + i);
			
			userRepository.save(user);
			log.info("New User is Created : " + user);
		}
		Optional<User> userWithIdOne = userRepository.findById(1L);
		log.info("User is Retrived : " + userWithIdOne);
		
		List<User> users = userRepository.findAll();
		log.info("All User are Retrived : " + users);
	}

}
