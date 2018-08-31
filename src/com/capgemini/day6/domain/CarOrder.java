package com.capgemini.day6.domain;

public class CarOrder implements Comparable <CarOrder>{
	private String make;
	private String model;
	private int year;
	private double price;
	public CarOrder() {
		super();
	}
	
	public CarOrder(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int compareTo(CarOrder c2) {
		int result=this.make.compareTo(c2.make);
		if(result==0)
			return this.model.compareTo(c2.model);
					return result;
			
	
}

	@Override
	public String toString() {
		return "CarOrder [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
}
