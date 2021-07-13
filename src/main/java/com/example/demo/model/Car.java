package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Car {

	private String model;
	private long yom;
	private long kmsTravelled;
	private double price;
	private String status;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Car(String model, long yom, long kmsTravelled, double price, String status) {
		super();
		this.model = model;
		this.yom = yom;
		this.kmsTravelled = kmsTravelled;
		this.price = price;
		this.status = status;
	}
	
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public long getYom() {
		return yom;
	}
	public void setYom(long yom) {
		this.yom = yom;
	}
	public long getKmsTravelled() {
		return kmsTravelled;
	}
	public void setKmsTravelled(long kmsTravelled) {
		this.kmsTravelled = kmsTravelled;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "Car [model=" + model + ", yom=" + yom + ", kmsTravelled=" + kmsTravelled + ", price=" + price
				+ ", status=" + status + "]";
	} 
	
	
}
