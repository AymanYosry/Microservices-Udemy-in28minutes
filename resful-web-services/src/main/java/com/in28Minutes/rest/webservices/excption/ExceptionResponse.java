/**
 * 
 */
package com.in28Minutes.rest.webservices.excption;

import java.util.Date;

/**
 * @author ayosry
 *
 */
public class ExceptionResponse
{
	//time stamp
	private Date timestamp;
	
	//exception message
	private String message;
	
	//exception details
	private String details;

	/**
	 * @param timestamp
	 * @param message
	 * @param details
	 */
	public ExceptionResponse(Date timestamp, String message, String details)
	{
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	/**
	 * @return the timestamp
	 */
	public Date getTimestamp()
	{
		return timestamp;
	}

	/**
	 * @return the message
	 */
	public String getMessage()
	{
		return message;
	}

	/**
	 * @return the details
	 */
	public String getDetails()
	{
		return details;
	}
}
