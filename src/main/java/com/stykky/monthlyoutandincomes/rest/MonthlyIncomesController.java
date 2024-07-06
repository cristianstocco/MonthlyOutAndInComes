/**
 * 
 */
package com.stykky.monthlyoutandincomes.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * made by stykky
 * MISSION: Controller for the monthly incomes
 */
@RestController
public class MonthlyIncomesController {

	@GetMapping( "/in/getAll" )
	public String getAll() {
		return "the incomes for the monthly controller";
	}
	
}
