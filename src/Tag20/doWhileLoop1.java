package Tag20;

import java.util.Scanner;

public class doWhileLoop1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int num = 0; 
		int sum = 0; 
		 
		do {   
		   System.out.println("Sayi giriniz"); 
		   num = scan.nextInt(); 
		   sum = sum + num;   
		}while(num!=0); 
		System.out.println(sum);
	}
}
