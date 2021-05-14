package Entities;

import java.time.LocalDate;
import Abstract.IEntity;

public class Campaign implements IEntity{
	private int id;
	private String name;
	private double discountRate;
	private LocalDate startDate;
	private LocalDate expirationDate;

	public Campaign(int id, String name, double discountRate, LocalDate startDate, LocalDate expirationDate) {
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


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getExpirationDate() {
		return expirationDate;
	}


	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

}
