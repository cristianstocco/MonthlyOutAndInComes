/**
 * 
 */
package com.stykky.monthlyoutandincomes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * made by stykky
 * MISSION: .......
 */
@Entity
@Table( name = "other" )
public class Other {
	
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id" )
	private Integer id;
	
	@Column( name = "the_money" )
	private Integer money;
	
	@Column( name = "detail" )
	private String detail;
	
}
