/**
 * 
 */
package com.in28minutes.springboot.jpa.entity.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.springboot.jpa.entity.User;

/**
 * @author ayosry
 *
 */
//@Repository
//@Transactional
public class UserDAOService
{
	//@PersistenceContext
	private EntityManager entityManager;

	public long insert(User user)
	{
		// Open Transaction
		entityManager.persist(user);
		// Close Transaction
		return user.getId();
	}
}
