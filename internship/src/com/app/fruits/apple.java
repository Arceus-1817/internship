package com.app.fruits;

import java.util.Scanner;

public class apple extends fruits {
	public apple() {
		super("Apple");
		
	}
	
	@Override
	public String taste() {
		return "sweet and sour";
	}

	

	@Override
	public String toString() {
		return "apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}
		
	

}
