package sunbeam.com;

public class try1 {

	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		import java.util.Scanner;

		public class Date {
		    private int day;
		    private int month;
		    private int year;

		    public Date() {
		        this.day = 1;
		        this.month = 1;
		        this.year = 1900;
		    }

		    public void initDate(int day, int month, int year) {
		        this.day = day;
		        this.month = month;
		        this.year = year;
		    }

		    public void printDate() {
		        System.out.printf("%02d-%02d-%04d\n", this.day, this.month, this.year);
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

		    public static void main(String[] args) {
		        Date date = new Date();
		        date.acceptDate();
		        date.printDate();
		    }
		}


	}

}
