package com.stykky.monthlyoutandincomes.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "wage" )
public class Wage {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id" )
	private Integer id;
	
	@Column( name = "the_provider" )
	private String provider;
	
	@Column( name = "the_money" )
	private Integer money;
	
	@Column( name = "gained" )
	private Calendar gained;

	public Wage(Integer id, String provider, Integer money, Calendar gained) {
		super();
		this.id = id;
		this.provider = provider;
		this.money = money;
		this.gained = gained;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}

	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}

	public Calendar getGained() {
		return gained;
	}
	public void setGained(Calendar gained) {
		this.gained = gained;
	}

	@Override
	public String toString() {
		return "Wage [id=" + id + ", provider=" + provider + ", money=" + money + ", gained=" + gained + "]";
	}
	
}
