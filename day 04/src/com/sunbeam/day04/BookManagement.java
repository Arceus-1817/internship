package com.sunbeam.day04;

	import java.sql.Date;
	import java.util.Scanner;

	public class BookManagement {
	@SuppressWarnings("deprecation")
	public static void acceptBook(Scanner sc,Book b) {
	Date d;
	System.out.println("Enter Book id");
	b.setIsbn(sc.next());
	System.out.println("Enter Book Category");
	b.setCat(sc.next());
	System.out.println("Enter Book Price");
	b.setPrice(sc.nextDouble());
	System.out.println("Enter Date(Year,Month,Day)");
	b.setPublishDate(d=new Date(sc.nextInt()-1900,sc.nextInt()-1,sc.nextInt()));
	System.out.println("Enter Author Name of The Book");
	b.setAuthorName(sc.next());
	System.out.println("Enter Quantity Of Book");
	b.setQuantity(sc.nextInt());

	}
	public static int menu(Scanner sc) {
	System.out.println("0.Exit");
	System.out.println("1.Display All Books");
	System.out.println("2.Find A Book");
	System.out.println("3.Add New Book");
	System.out.println("4.Remove Book");
	System.out.println("5.Edit Book Details(Quantity)");
	System.out.println("Enter Your Choice:");
	return sc.nextInt();
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int choice=1,index=0;
	System.out.println("Enter no book You want to take");
	int n=sc.nextInt();
	Book[] bookArray= new Book[n];
	while((choice=menu(sc))!=0) {
	switch (choice) {
	case 1:for(Book ele : bookArray) {
	if(ele!= null) {
	System.out.println(ele);
	}
	}

	break;
	case 2:System.out.println("Enter isbn :");
	String find=sc.next();
	for(Book ele: bookArray) {
	if(ele.isbn.equals(find))
	System.out.println("Book Found At:"+ele);
	else
	System.out.println("No such Book is Present!!!");

	}
	break;
	case 3:if(index<10) {
	bookArray[index] = new Book();
	acceptBook(sc,bookArray[index]);
	index++;
	System.out.println("Book Added Successfully!!!");
	}
	else {
	System.out.println("Book Adding limit Reached");
	}
	break;
	case 4:System.out.println("Enter index of Book that is to be removed");
	int temp=sc.nextInt();
	for(int i=temp;i<=index;i++) {
	bookArray[i]=bookArray[i+1];
	}index--;






	break;
	case 5:System.out.println("Enter isbn of Book that is to be updated");
	String i=sc.next();
	System.out.println("Enter new Quantity of that Book");
	int temp1=sc.nextInt();
	for(Book ele: bookArray) {
	if(i.equals(ele.getIsbn())) {

	ele.setQuantity(temp1);
	}

	}
	break;

	default:System.out.println("Invalid Choice");
	break;
	}
	}

	}

	}

