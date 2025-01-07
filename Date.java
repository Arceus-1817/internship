package sunbeam.com;

import java.util.Scanner;

public class Date {
		private int day;
		private int month;
		private int year;

		
		 public Date() {
		        this.day = 23;
		        this.month = 05;
		        this.year = 2004;
		    }
		    public void initDate( int day,int month,int year) {
		       day=this.day;
		       month=this.month;
		       year=this.year;
		    }

		  

		    public void acceptDate() {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter day: ");
		        this.day = scanner.nextInt();

		        System.out.print("Enter month: ");
		        this.month = scanner.nextInt();

		        System.out.print("Enter year: ");
		        this.year = scanner.nextInt();
		    }
		    
		    public void printDate() {
		        System.out.print("date :" +this.day);
		        System.out.print("/" + this.month);
		        System.out.print("/" + this.year);
		        
		    }
	
	public static void main(String[] args) {
		
		Date date =new Date();
		date.acceptDate();
        date.printDate();
		
	}
	}

