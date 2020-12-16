/**
 * 
 */
package com.in28Minutes.rest.webservices.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author ayosry
 *
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param message
	 * by default send internal server error
	 * we want to send user not found status
	 */
	public UserNotFoundException(String message)
	{
		super(message);
	}
	
}
