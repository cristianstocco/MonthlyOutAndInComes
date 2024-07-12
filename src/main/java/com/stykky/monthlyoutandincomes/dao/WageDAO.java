/**
 * 
 */
package com.stykky.monthlyoutandincomes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.provider.HibernateUtils;
import org.springframework.stereotype.Component;

import com.stykky.monthlyoutandincomes.model.Wage;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

/**
 * made by stykky
 * MISSION: Data Access Object for wage incomes
 */
@Component
public class WageDAO implements IWageDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public WageDAO( EntityManager entityManager ) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Wage> findAll() {
		TypedQuery<Wage> query = entityManager.createQuery("FROM Wage", Wage.class);
		
		return query.getResultList();
	}

}
