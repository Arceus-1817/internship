package com.app.fruits;

import java.util.Scanner;

public class mango extends fruits{

	public mango() {
		super("Mango");
		
	}
	
	@Override
	public String taste() {
		return "sweet";
	}

	@Override
	public String toString() {
		return "mango [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
	}
		
	
}
