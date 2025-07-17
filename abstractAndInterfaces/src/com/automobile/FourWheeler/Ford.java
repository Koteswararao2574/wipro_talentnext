package com.automobile.FourWheeler;

public class Ford {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	private int temparature;
	public Ford(String modelName, String registrationNumber, String ownerName,int speed) {
		this.modelName = modelName;
		this.registrationNumber = registrationNumber;
		this.ownerName = ownerName;
		this.speed = speed;
	}
	public String getModelName() {
		return this.modelName;
	}
	public String getRegistrationNumber() {
		return this.registrationNumber;
	}
	public String getOwnerName() {
		return this.ownerName;
	}
	
	public int getSpeed() {
		return this.speed;
	}
	
	public void tempControl() {
		System.out.println("AC is enabled on your car.");
	}

}
