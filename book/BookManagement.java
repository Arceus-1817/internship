package com.app.book;

import java.util.Date;
import java.util.Scanner;

public class BookManagement {
		
		private static int menu(Scanner sc) {
			
			System.out.println("#####################");
			System.out.println("0.Exit");
			System.out.println("1.Add Book");
			System.out.println("2.Remove book");
			System.out.println("3.Edit Details(Quantity)");
			System.out.println("4.Find Book");
			System.out.println("5.Display");
			System.out.println("#####################");
			System.out.println("Enter choice: ");
			
			return sc.nextInt();

		}
	
		@SuppressWarnings("deprecation")
		public static void acceptBook(Scanner sc, Book b) {
			
			Date d;
			System.out.println("Enter isbn: ");
			b.setIsbn(sc.next());
			System.out.println("Enter Category: ");
			b.setCat(sc.next());
			System.out.println("Enter Price: ");
			b.setPrice(sc.nextDouble());
			System.out.println("Enter Published date(year, month, date): ");
			b.setPublishDate(d = new Date(sc.nextInt() - 1900, sc.nextInt(),sc.nextInt()));
			System.out.println("Enter Author Name: ");
			b.setAuthor(sc.next());
			System.out.println("Enter quanity: ");
			b.setQuantity(sc.nextInt());
			
		}
		
		public static void main(String[] args) {
			
			Book[] BookArray;
			BookArray = new Book[10];
			String Temp;
			int temp;
			int index=0;
			int choice = 1;
			Scanner sc = new Scanner(System.in);
			
			
			while(choice != 0){
				
				choice = menu(sc);
				
				switch (choice) {
				case 0:
					System.out.println("Exited!!!!");
					break;
				case 1:
					if(index<10) {
						
						BookArray[index] = new Book();
						acceptBook(sc, BookArray[index]);
						index++;
						System.out.println("New Book Added !!!!!");
						
					}else {
						System.out.println("Book addition failed!!!");
					}
					break;
				case 2:
					System.out.println("Enter index to remove the Book");
					temp = sc.nextInt();
					for(int i=temp; i<=index; i++) {
						
						BookArray[i] = BookArray[i+1];
						
					}
					index--;
					break;
				case 3:
					System.out.println("Enter Isbn: ");
					Temp = sc.next();
					System.out.println("Enter Updated Quantity: ");
					temp = sc.nextInt();
					
					for(Book ele: BookArray) {
						if(Temp.equals(ele.getIsbn())) {
//							System.out.println(ele);
							ele.setQuantity(temp);
							break;
						}
					}
					
					break;
				case 4:
					System.out.println("Enter book Isbn: ");
					int flag = 0;
					Temp = sc.next();
					for(Book ele: BookArray) {
						if(Temp.equals(ele.getIsbn())) {
							System.out.println(ele);
							System.out.println("Book found!!!");
							flag++;
							break;
						}
					}
					if(flag!=0)
						System.out.println("Book Not found");
					break;
				case 5:
					for(Book ele: BookArray) {
						if(ele != null)
						System.out.println(ele);
						
					}
					break;

				default:
					System.out.println("Enter valid choice!!");
					break;
				}
				
			}
			
			
			
			
		}
	
}
