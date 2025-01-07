package sunbeam.com;

import java.util.Scanner;

public class Menu {


			public static int menu(Scanner sc)
			{
				System.out.println("Menu");
				System.out.println("");
				System.out.println("1.IDLI      :40Rs");
				System.out.println("2.DOSA      :60Rs");
				System.out.println("3.SAMOSA    :20Rs");
				System.out.println("");
				System.out.println("4.For bill  :    ");
				System.out.println("");
				System.out.println("Enter your Choice ");
				return sc.nextInt();
			}
			public static void main(String[] args) {
				
				Scanner sc =new Scanner(System.in);
				double t1=0,t2=0,t3=0,total=0;
				int choice,q;
				while((choice=menu(sc))!=4)
				{
					switch(choice)
					{
					case 1:
						System.out.println("Enter the quantity (IDLI): ");
						 q=sc.nextInt();
						 t1=q*40;
						 total=total+t1;
						 break;
					case 2:
						System.out.println("Enter the quantity (DOSA): ");
						 q=sc.nextInt();
						 t2=q*60;
						 total=total+t2;
						 break;
					case 3:
						System.out.println("Enter the quantity (SAMOSA): ");
						 q=sc.nextInt();
						 t3=q*20;
						 total=total+t3;
						 break;
						 
					case 4:
						break;
					default:
						System.out.println("Enter valid choice !!!");
						 break;
								 						 
								 
					}
					
				}
				total=t1+t2+t3;
				System.out.println("the Total Bill is : "+total+"Rs");
			}

		}

		