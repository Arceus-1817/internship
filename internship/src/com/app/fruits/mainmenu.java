package com.app.fruits;

import java.util.Scanner;

public class mainmenu {
	public static int menu(Scanner sc) {
		System.out.println("*********************");
		System.out.println("0.Exit");
		System.out.println("1.Add Apple");
		System.out.println("2.Add Mango");
		System.out.println("3.Add Orange");
		System.out.println("4.Display");
		System.out.println("5.Display properties of each fruit");
		System.out.println("6.Display tastes of all stale(not fresh) fruits");
		System.out.println("*********************");

		return sc.nextInt();
	}
	
	public static void main (String []args) {
		Scanner sc =new Scanner (System.in);
		int count=0;
		System.out.println("Enter the size  of the basket :");
		int size= sc.nextInt();
		fruits [] basket=new fruits[size];
		int ch;
		while((ch=menu(sc))!=0) {
			switch (ch) {
			case 1:basket[count]=new apple();
				count++;
				break;
				
			case 2:basket[count]=new mango();
			count++;
			break;
			
			case 3:basket[count]=new orange();
			count++;
			break;
			
			case 4:for (fruits f : basket) {
				if(f!=null) {
					System.out.println(f.getName());
				}
			}
			break;
			
			case 5:for (fruits f : basket) {
				if(f!=null&& f.isFresh) {
					System.out.println(f);
					System.out.println("taste :"+f.taste());
					System.out.println("Fruit is fresh :"+f.isFresh);
					
				}
			}
			break;
			
			case 6:for (fruits f : basket) {
				if(f!=null && f.isFresh==false) {
					System.out.println("taste :"+f.taste());
				}
			}
			break;

			default:
				System.out.println("Please enter a valid choice.....");
				break;
			}
		}
		sc.close();

	}
}
