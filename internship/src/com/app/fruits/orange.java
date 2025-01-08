package com.app.fruits;

import java.util.Scanner;

public class orange extends fruits {
	public orange() {
		super("orange");
		
	}
	
	@Override
	public String taste() {
		return "sour";
	}

	

	@Override
	public String toString() {
		return "orange [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}
		
	
}

