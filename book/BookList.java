package com.app.book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import com.app.book.BookManagement;

public class BookList {
	
	private static int menu(Scanner sc) {
		
		System.out.println("#####################");
		System.out.println("0.Exit");
		System.out.println("1.Add Book");
		System.out.println("2.Remove book");
		System.out.println("3.Edit Details(Quantity)");
		System.out.println("4.Find Book");
		System.out.println("5.Display");
		System.out.println("6.Sort by isbn");
		System.out.println("7.Sort by Author");
		System.out.println("#####################");
		System.out.println("Enter choice: ");
		
		return sc.nextInt();

	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		ArrayList<Book> BookList = new ArrayList<Book>();
		
		
		while(choice != 0) {
			
			choice = menu(sc);
			
			String Temp;
			int temp;
			switch (choice) {
			case 0:
				System.out.println("Exited!!!!");
				break;
			case 1:
				Book b = new Book();
				BookManagement.acceptBook(sc, b);
				if(Validation.validate_date(BookList, b.getPublishDate()) && Validation.validate_Isbn(BookList, b.getIsbn()) && Validation.validate_Cat(BookList, b.getCat()))
				BookList.add(b);
				else
					System.out.println("Enter valid book info!");
				
				break;
			case 2:
				System.out.println("Enter index to remove: ");
				temp = sc.nextInt();
				BookList.remove(temp);
				break;
			case 3:
				System.out.println("Enter Isbn: ");
				Temp = sc.next();
				System.out.println("Enter Updated Quantity: ");
				temp = sc.nextInt();
				
				for(Book ele: BookList) {
					if(Temp.equals(ele.getIsbn())) {
						ele.setQuantity(temp);
						System.out.println("Quantity is set as: "+ ele.getQuantity());
						break;
					}
				}
				break;
			case 4:
				System.out.println("Enter book Isbn: ");
				int flag = 0;
				Temp = sc.next();
				for(Book ele: BookList) {
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
				for(Book ele : BookList) {
					
					System.out.println(ele);
					
				}
				break;
			case 6:
				BookList.sort((e1,e2)->e1.getIsbn().compareTo(e2.getIsbn()));
				break;
			case 7:
				BookList.sort((e1,e2)->e1.getAuthor().compareTo(e2.getAuthor()));
				break;

			default:
				break;
			}
			
		}
		
	}
	
	
	
}
