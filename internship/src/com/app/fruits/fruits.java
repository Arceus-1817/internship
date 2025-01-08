package com.app.fruits;

import java.util.Scanner;

public class fruits {
	String color;
	double weight;
	String name;
	boolean isFresh;
	public fruits(String name) {		
		this.name = name;
		this.isFresh = true;
	}
	
	public String getColor() {
		return color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	
	public String taste() {
		return "no specific taste";
	}
	
	public void accept(Scanner sc) {
		System.out.println("Enter the colour of the fruit: ");
		color = sc.next();
		System.out.println("Enter the weight of the fruit: ");
		weight = sc.nextDouble();
	}
}


