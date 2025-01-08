package com.sunbeam;

import java.util.Scanner;

public class tester {
	static Scanner sc = new Scanner(System.in);

	public static int menuList() {

		System.out.println("*");
		System.out.println("0.Exit");
		System.out.println("1. Hire Manager");
		System.out.println("2. Hire Worker");
		System.out.println("3. Display Employee Info");
		System.out.println("4. Update Basic Salary");
		System.out.println("*");
		System.out.print("Enter your choice	:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice = 0;
		System.out.println("Enter NO of Employees");
		employee[] emps = new employee[sc.nextInt()];
		int cntr=0;
		while ((choice = menuList()) != 0) {
			switch (choice) {
			case 1:
				if(cntr<emps.length)
				{
					System.out.println("Enter emp details: id, name,dept,basic,performanceBonus");
					emps[cntr++]=new manager(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
				}else
					System.out.println("limit reached for no of employees!");
				break;
			case 2:
				if(cntr<emps.length)
				{
					System.out.println("Enter emp details: id, name,dept,basic,hours worked, hourly wage");
					emps[cntr++]=new worker(sc.nextInt(), sc.next(), sc.next(), sc.nextDouble(), sc.nextInt(), sc.nextDouble());
				}else
					System.out.println("limit reached for no of employees!");
				break;
			case 3:
				for (employee employee : emps) {
					if(employee!=null)
					{
						double sal=employee.computeNetSalary();
						System.out.println(employee+" "+sal);
					}
				}
				break;
			case 4:
				System.out.println("Enter emp id whose basic to be update :");
				int empIdToUpdate=sc.nextInt();
				employee empToUpdate=null;
				for(int i=0;i<emps.length;i++)
				{
					if(emps[i]!=null) 
					{
						if(emps[i].getEmpId()==empIdToUpdate)
						{
							empToUpdate=emps[i];
							System.out.print("Enter salary to be update :");
							empToUpdate.setBasicsalary(sc.nextDouble());
						}
					}
				}
				if(empToUpdate == null)
					System.out.println("Therer is no such Employee!");
				break;
			}
		}

	}
}