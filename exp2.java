package sunbeam.com;
import java.lang.*;
import java.util.Scanner;
public class exp2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
          System.out.println("Enter your name: ");
          String word = sc.nextLine();
          System.out.println(word.toLowerCase());
          System.out.println(word.charAt(0));
          int a =word.length();
          for(int i=0;i<a;i++) {
        	  if(word.charAt(i)=='a' || word.charAt(i)=='A') {
        		  System.out.println("yes the character exists");
        		  break;
        	  }else {
        		  System.out.println("no it does not exist");
        		  break;
        	  }
          }
          
	}

}
