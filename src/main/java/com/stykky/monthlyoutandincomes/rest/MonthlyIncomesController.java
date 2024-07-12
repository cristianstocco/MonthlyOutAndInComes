/**
 * 
 */
package com.stykky.monthlyoutandincomes.rest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stykky.monthlyoutandincomes.dao.InvestmentDAO;
import com.stykky.monthlyoutandincomes.dao.WageDAO;
import com.stykky.monthlyoutandincomes.model.Investment;
import com.stykky.monthlyoutandincomes.model.Wage;

/**
 * made by stykky
 * MISSION: Controller for the monthly incomes
 */
@RestController
public class MonthlyIncomesController {
	
	@Autowired
	private WageDAO wageDAO;
	@Autowired
	private InvestmentDAO investmentDAO;

	/*
	 * retrieves all the incomes, from wages and investments
	 */
	@GetMapping( "/in/getAll" )
	public ResponseEntity<Object> getAll() {
		Map<String, Object> response = new HashMap<>();
		
		List<Wage> wages = wageDAO.findAll();
		List<Investment> investments = investmentDAO.findAll();
		
		response.put("wages", wages);
		response.put("investments", investments);
		
		return ResponseEntity.ok( response );
	}
	
}
