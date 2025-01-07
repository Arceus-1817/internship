package sunbeam.com;

import java.util.Scanner;

public class student {
	private int rollno;
	private String name;
	private int marks;
	
	student(){
		this.rollno =1;
		this.name ="shreyansh";
		this.marks =100;
		
	}
	
	public void init (int rollno , String name,int marks) {
		rollno =this.rollno;
		name =this.name;
		marks =this.marks;
	}
	
	public void display() {
		System.out.println("Student Details :" );
		System.out.println("Student rollno :" +this.rollno );
		System.out.println("Student name :" +this.name );
		System.out.println("Student marks :" +this.marks );
	}
	
	public void accept() {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter Student rollno :");
		rollno=sc.nextInt();
		System.out.println("Enter Student name :");
		name=sc.next();
		System.out.println("Enter Student marks :");
		marks=sc.nextInt();
	}
	

	public static void main(String[] args) {
		student st=new student();
		st.accept();
		st.display();
	}

}
