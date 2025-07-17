package com.wipro.automobile.ship;

public class Compartment {

	private double height;
	private double width;
	private double breadth;

	public Compartment(double height, double width, double breadth) {
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	public double getBreadth() {
		return breadth;
	}

	public double calculateVolume() {
		return height * width * breadth;
	}

	public void display() {
		System.out.println("Height: " + height);
		System.out.println("Width: " + width);
		System.out.println("Breadth: " + breadth);
		System.out.println("Volume: " + calculateVolume());
	}
}
