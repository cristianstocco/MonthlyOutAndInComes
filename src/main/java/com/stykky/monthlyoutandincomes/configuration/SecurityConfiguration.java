/**
 * 
 */
package com.stykky.monthlyoutandincomes.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * made by stykky
 * MISSION: security configuration workaround for h2-console access (NOT FOR PRODUCTION)
 */
@Configuration 
public class SecurityConfiguration {
	
    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring().requestMatchers(new AntPathRequestMatcher("/h2-console/**"));
    }
    
}