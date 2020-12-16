/**
 * 
 */
package com.in28Minutes.rest.webservices.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author ayosry
 *
 */
@Component
public class UserDAOService
{
	private static List<User> users = new ArrayList<>();
	private static int userCounter = 3;
	static
	{
		users.add(new User(1, "Ayman", new Date()));
		users.add(new User(2, "Yusuf", new Date()));
		users.add(new User(3, "Adam", new Date()));
	}

	public List<User> findAll()
	{
		return users;
	}

	public User save(User user)
	{
		if (user.getId() == null) user.setId(++userCounter);
		// Open Transaction
		users.add(user);
		// Close Transaction
		return user;
	}

	public User findOne(int id)
	{
		for (User user : users)
			if (user.getId() == id) return user;
		return null;
	}

	public User deleteById(int id)
	{
		Iterator<User> iterator = users.iterator();
		while (iterator.hasNext())
		{
			User user = iterator.next();
			if (user.getId() == id)
			{
				iterator.remove();
				return user;
			}
		}
		return null;
	}
}
