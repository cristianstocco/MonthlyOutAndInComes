/**
 * 
 */
package com.stykky.monthlyoutandincomes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stykky.monthlyoutandincomes.model.Other;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

/**
 * made by stykky
 * MISSION: 
 */
@Component
public class OtherDAO implements IOtherDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public OtherDAO( EntityManager entityManager ) {
		this.entityManager = entityManager;
	}
	
	@Transactional
	@Override
	public List<Other> findAll() {
		TypedQuery<Other> query = entityManager.createQuery( "FROM Other", Other.class );
		
		return query.getResultList();
	}
	
	@Transactional
	@Override
	public void save(Other other) {
		
	}

}
