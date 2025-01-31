package com.app.book;


import java.util.Date;
import java.util.Objects;

public class Book implements Comparable<Book>{
	
	protected String isbn;
	protected double price;
	@SuppressWarnings("deprecation")
	protected Date publishDate = new Date(0 ,0 ,0);
	protected Category cat ;
	protected String author;
	protected int quantity;
	
	
	public Book() {
		
		isbn = null;
		price = 0.0;
		cat = null;
		author = null;
		quantity = 0;
		
		
	}



	public Book(String isbn, double price, Date publishDate, Category cat, String author, int quantity) {
		super();
		this.isbn = isbn;
		this.price = price;
		this.publishDate = publishDate;
		this.cat = cat;
		this.author = author;
		this.quantity = quantity;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public Date getPublishDate() {
		return publishDate;
	}



	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}



	public Category getCat() {
		return cat;
	}



	public void setCat(String c) {
		if(c.toLowerCase().equals("science"))
			this.cat = Category.SCIENCE;
		else if(c.toLowerCase().equals("fiction"))
			this.cat = Category.FICTION;
		else if(c.toLowerCase().equals("health"))
			this.cat = Category.HEALTH;
		else if(c.toLowerCase().equals("history"))
			this.cat = Category.HISTORY;
		else if(c.toLowerCase().equals("mystery"))
			this.cat = Category.MYSTERY;
		else if(c.toLowerCase().equals("biography"))
			this.cat = Category.BIOGRAPHY;
		
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", publishDate=" + publishDate + ", cat=" + cat + ", author="
				+ author + ", quantity=" + quantity + "]";
	}



	@Override
	public int hashCode() {
		return Objects.hash(author, isbn);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(isbn, other.isbn);
	}



	@Override
	public int compareTo(Book o) {
		// TODO Auto-generated method stub
		return this.isbn.compareTo(isbn);
	}
	
	



	




	
	
	
	
	
}
