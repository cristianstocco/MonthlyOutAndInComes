package com.stykky.monthlyoutandincomes.model;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table( name = "investment" )
public class Investment {

	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY )
	@Column( name = "id" )
	private Integer id;
	
	@Column( name = "bank" )
	private String bank;
	
	@Column( name = "the_money" )
	private Integer money;
	
	@Column( name = "gained" )
	private Calendar gained;

	public Investment(Integer id, String bank, Integer money, Calendar gained) {
		super();
		this.id = id;
		this.bank = bank;
		this.money = money;
		this.gained = gained;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
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
		return "Investment [id=" + id + ", bank=" + bank + ", money=" + money + ", gained=" + gained + "]";
	}
	
}
