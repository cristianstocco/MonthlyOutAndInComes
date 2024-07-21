/**
 * 
 */
package com.stykky.monthlyoutandincomes.dao;

import java.util.List;

/**
 * made by stykky
 * MISSION: general resource for Data Access Object
 */
public interface IGeneralResourceDAO<T> {
	
	public List<T> findAll();
	
	public void save(T t);

}
