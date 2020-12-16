/**
 * 
 */
package com.in28minutes.springboot.jpa.entity.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.springboot.jpa.entity.User;

/**
 * @author ayosry
 * used instead of UserDAOService
 */
public interface UserRepository extends JpaRepository<User, Long>
{
}
