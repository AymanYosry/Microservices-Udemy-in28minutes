/**
 * 
 */
package com.in28Minutes.rest.webservices.helloworld;

/**
 * @author ayosry
 *
 */
public class HelloWorldBean
{
	private String message;

	public HelloWorldBean(String message)
	{
		this.message = message; 	
	}

	public void setMessage(String message)
	{
		this.message = message;
	}

	/*
	 * this method important o avoid the raised exception:
	 * This application has no explicit mapping for /error, so you are seeing this as a fallback.
	   Thu Aug 20 14:44:01 EET 2020
	   There was an unexpected error (type=Internal Server Error, status=500).
	   No converter found for return value of type: class com.in28Minutes.rest.webservices.HelloWorldBean
	 */
	public String getMessage()
	{
		return message;
	}

	@Override
	public String toString()
	{
		return "HelloWorldBean [message=" + message + "]";
	}
	
	
}
