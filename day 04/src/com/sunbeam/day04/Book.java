package com.sunbeam.day04;

import java.util.Date;
import java.util.Objects;

enum Category{SCIENCE , FICTION, HEALTH ,HISTORY, MYSTERY, BIOGRAPHY}
public class Book implements Comparable<Book> {

protected String isbn;
protected double price;
@SuppressWarnings("deprecation")
protected Date publishDate=new Date(0,0,0);
protected String authorName;
protected int quantity;
protected Category cat;

public Book() {
this.isbn=null;
this.price=0.0d;
this.authorName=null;
this.quantity=0;
this.cat=null;

}

public Book(String isbn, double price, Date publishDate, String authorName, int quantity) {
super();
this.isbn = isbn;
this.price = price;
this.publishDate = publishDate;
this.authorName = authorName;
this.quantity = quantity;
this.cat=cat;
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

public String getAuthorName() {
return authorName;
}

public void setAuthorName(String authorName) {
this.authorName = authorName;
}

public int getQuantity() {
return quantity;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
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

@Override
public String toString() {
return "Book [isbn=" + isbn + ", price=" + price + ", publishDate=" + publishDate + ", authorName="
+ authorName + ", quantity=" + quantity + "]";
}

@Override
public int hashCode() {
return Objects.hash(authorName, isbn);
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
return Objects.equals(authorName, other.authorName) && Objects.equals(isbn, other.isbn);
}

@Override
public int compareTo(Book o) {
return this.isbn.compareTo(isbn);

}




}