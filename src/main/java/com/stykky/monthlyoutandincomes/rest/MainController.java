/**
 * 
 */
package com.stykky.monthlyoutandincomes.rest;

import java.util.HashMap;
import java.util.Map;

import org.flywaydb.core.Flyway;
import org.flywaydb.core.api.output.InfoResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * made by stykky
 * MISSION: Controller for the main controller, common usages
 */
@RestController()
public class MainController {
	
	@Autowired
	private Flyway flyway;
	private final String HELLO_WORLD = "HelloWorld! The user is '%s', within the team '%s' :)";
	
	@Value("${user.name}")
	private String USER_NAME;
	
	@Value("${user.team}")
	private String USER_TEAM;

	@GetMapping("/")
	public String hello() {
		return String.format( HELLO_WORLD, USER_NAME, USER_TEAM );
	}
	
	@GetMapping("/migrate")
	public ResponseEntity<Object> migrate() {
		Map<String, Object> response = new HashMap<>();
		
		try {
			InfoResult result = flyway.info().getInfoResult();
			System.out.println( "MIGRATION TO: "+result.database+", WITH SCHEMA: "+result.schemaName+", FROM VERSION: "+result.schemaVersion );
			flyway.migrate();
			
			response.put("success", true);
		}
		catch( Exception ex ) {
			response.put("success", false);
			response.put("error", ex.toString());
		}
		
		return ResponseEntity.ok(response);
	}
	
	@GetMapping("/rollback")
	public ResponseEntity<Object> rollback() {
		Map<String, Object> response = new HashMap<>();
		
		try {
			InfoResult result = flyway.info().getInfoResult();
			System.out.println( "ROLLING BACK TO: "+result.database+", WITH SCHEMA: "+result.schemaName+", FROM VERSION: "+result.schemaVersion );
			flyway.clean();
			
			response.put("success", true);
		}
		catch( Exception ex ) {
			response.put("success", false);
			response.put("error", ex.toString());
		}
		
		return ResponseEntity.ok(response);
	}
	
}
