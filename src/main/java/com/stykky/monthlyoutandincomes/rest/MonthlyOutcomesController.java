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

import com.stykky.monthlyoutandincomes.dao.OtherDAO;
import com.stykky.monthlyoutandincomes.dao.ShoppingDAO;
import com.stykky.monthlyoutandincomes.model.Other;
import com.stykky.monthlyoutandincomes.model.Shopping;

/**
 * made by stykky
 * MISSION: Controller for the monthly outcomes
 */
@RestController()
public class MonthlyOutcomesController {
	
	@Autowired
	private ShoppingDAO shoppingDAO;
	@Autowired
	private OtherDAO otherDAO;

	@GetMapping( "/out/getAll" )
	public ResponseEntity<Object> getAll() {
		Map<String, Object> response = new HashMap<>();
		
		List<Shopping> shoppings = shoppingDAO.findAll();
		List<Other> others = otherDAO.findAll();
		
		response.put( "shoppings", shoppings );
		response.put( "others", others );
		
		return ResponseEntity.ok( response );
	}
	
}
