/**
 * 
 */
package com.in28minutes.springboot.jpa.entity.service;

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
//@Component
public class UserDAOServiceCommandLineRunner2 //implements CommandLineRunner
{
	private static final Logger log = LoggerFactory.getLogger(UserDAOServiceCommandLineRunner2.class);

	//@Autowired
	private UserDAOService userDAOService;

	//@Override
	public void run(String... args) throws Exception
	{
		for (int i = 1; i <= 5; i++)
		{
			User user = new User("Ayman" + i, "Role" + i);
			userDAOService.insert(user);
			log.info("New User is Created : " + user);
		}
	}

}
