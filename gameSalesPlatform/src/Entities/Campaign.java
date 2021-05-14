package Entities;

import java.util.Date;

import Abstract.IEntity;

public class Campaign implements IEntity{
	private int id;
	private String name;
	private double discountRate;
	private Date startDate;
	private Date expirationDate;

	public Campaign(int id, String name, double discountRate, Date startDate, Date expirationDate) {
		this.id = id;
		this.name = name;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.expirationDate = expirationDate;
	}
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getDiscountRate() {
		return discountRate;
	}


	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}


	public Date getStartDate() {
		return startDate;
	}


	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}


	public Date getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

}
