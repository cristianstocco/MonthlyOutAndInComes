/**
 * 
 */
package com.stykky.monthlyoutandincomes.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.stykky.monthlyoutandincomes.model.Investment;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

/**
 * made by stykky
 * MISSION: Data Access Object for investment incomes
 */
@Component
public class InvestmentDAO implements IInvestmentDAO {
	
	private EntityManager entityManager;
	
	@Autowired
	public InvestmentDAO( EntityManager entityManager ) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public List<Investment> findAll() {
		TypedQuery<Investment> query = entityManager.createQuery("FROM Investment", Investment.class);
		
		return query.getResultList();
	}
	
	@Override
	@Transactional
	public void save(Investment investment) {
		
	}

}
