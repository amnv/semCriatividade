package com.example.allyson.roteiro;

public class Locals {
	String name;
	String description;
	double price;
	String schedule;
	String timeSpend;
	double latitude;
	double longitude;
	
	public Locals(String name, String description, double price, String schedule, String timeSpend, double latitude,
	double longitude){
		this.name = name;
		this.description = description;
		this.price = price;
		this.schedule = schedule;
		this.timeSpend = timeSpend;
		this.latitude = latitude;
		this.longitude = longitude;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSchedule() {
		return schedule;
	}

	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}

	public String getTimeSpend() {
		return timeSpend;
	}

	public void setTimeSpend(String timeSpend) {
		this.timeSpend = timeSpend;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
}
