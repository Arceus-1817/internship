package sunbeam.com;

import java.util.Scanner;
class test {

    enum Color {
        RED, GREEN, BLUE;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word: ");
            String word = sc.nextLine();
            System.out.println(word.toUpperCase()); 
            System.out.println(word.length()); 
            for (Color col : Color.values()) {
            System.out.println(col); 
            
        }
    }
}

