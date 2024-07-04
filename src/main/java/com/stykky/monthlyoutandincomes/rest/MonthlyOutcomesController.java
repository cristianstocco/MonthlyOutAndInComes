/**
 * 
 */
package com.stykky.monthlyoutandincomes.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * made by stykky
 * MISSION: Controller for the monthly outcomes
 */
@RestController()
public class MonthlyOutcomesController {

	@GetMapping("/")
	public String hello() {
		return "HelloWorld!";
	}
	
}
