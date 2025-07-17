package com.automobile.twowheeler;

import com.automobile.Vehicle;
public class Honda {
	private String modelName;
	private String registrationNumber;
	private String ownerName;
	private int speed;
	public Honda(String modelName, String registrationNumber, String ownerName,int speed) {
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
	
	public void cdplayer() {
		System.out.println("CD player is turned ON in Honda Car.");
	}
}
