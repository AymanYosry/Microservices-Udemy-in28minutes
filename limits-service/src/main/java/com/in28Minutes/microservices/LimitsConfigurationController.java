/**
 * 
 */
package com.in28Minutes.microservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28Minutes.microservices.bean.LimitConfiguration;

/**
 * @author ayosry
 *
 */
@RestController
public class LimitsConfigurationController
{
	@Autowired
	Configuration configuration; 
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigurations()
	{
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
}
