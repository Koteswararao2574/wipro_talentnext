package com.automobile.FourWheeler;

import com.automobile.*;
public class Logan {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Logan(String modelName, String registrationNumber, String ownerName,int speed) {
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
	
	public void GPS() {
		System.out.println("GPS is enabled on your car.");
	}
	

}
