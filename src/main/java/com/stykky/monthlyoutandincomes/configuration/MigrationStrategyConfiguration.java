/**
 * 
 */
package com.stykky.monthlyoutandincomes.configuration;

import org.springframework.boot.autoconfigure.flyway.FlywayMigrationStrategy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * made by stykky
 * MISSION: Configuration a migration strategy for flyway
 */
@Configuration
public class MigrationStrategyConfiguration {
	
	@Bean
	public FlywayMigrationStrategy emptyMigration() {
		return flyway -> {
			flyway.info();
		};
	}

}
