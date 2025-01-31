package com.app.book;

import java.util.ArrayList;
import java.util.Date;

public class Validation {

	public static boolean validate_Isbn(ArrayList<Book> List, String Isbn) {
		
		for(Book ele : List) {
			
			if(Isbn.equals(ele.getIsbn())){
				
				return false;
			
			}
			
		}
		
		return true;
		
	}
	
	public static boolean validate_Cat(ArrayList<Book> List, Category c) {
		
		if(c==Category.BIOGRAPHY || c==Category.FICTION || c==Category.HEALTH || c==Category.HISTORY || c==Category.MYSTERY || c==Category.SCIENCE)
			return true;
		else
			return false;
		
	}
	
	@SuppressWarnings("deprecation")
	public static boolean validate_date(ArrayList<Book> List, Date d) {
		
		if((d.getDate()>=1 && d.getMonth()>=4 && d.getYear()>=2023) && (d.getDate()<=31 && d.getMonth()<=3 && d.getYear()<=2024))
			return true;
		else
			return false;
	}
	
}
