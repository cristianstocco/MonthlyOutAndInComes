/**
 * 
 */
package com.stykky.monthlyoutandincomes.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * made by stykky
 * MISSION: Controller for the monthly outcomes
 */
@RestController()
public class MonthlyOutcomesController {
	
	private final String HELLO_WORLD = "HelloWorld! The user is '%s', within the team '%s' :)";
	
	@Value("${user.name}")
	private String USER_NAME;
	
	@Value("${user.team}")
	private String USER_TEAM;

	@GetMapping("/")
	public String hello() {
		return String.format( HELLO_WORLD, USER_NAME, USER_TEAM );
	}
	
}
