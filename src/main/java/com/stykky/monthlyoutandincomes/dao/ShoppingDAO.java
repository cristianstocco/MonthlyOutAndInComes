/**
 * 
 */
package com.stykky.monthlyoutandincomes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stykky.monthlyoutandincomes.model.Shopping;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

/**
 * made by stykky
 * MISSION: Data...............
 */
@Component
public class ShoppingDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public ShoppingDAO( EntityManager entityManager ) {
		this.entityManager = entityManager;
	}

	public List<Shopping> findAll() {
		TypedQuery<Shopping> query = entityManager.createQuery( "FROM Shopping", Shopping.class );
		
		return query.getResultList();
	}
	
}
