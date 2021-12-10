package day19;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		/*Ask user to enter a name and a character, 
		 * then check how many times the character is 
		 * repeated in the name using loops in the name
		e.g:

		char ch1= 'a' ;

		String name =“John came late"

		Expected Output: Number of a = 2 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String name = scan.nextLine();
		System.out.println("bir krakter giriniz: ");
		char harf = scan.next().charAt(0);
			
		HarfSay(name,harf);
		 }
			 
		public static void HarfSay(String name, char harf)
		 {
		     int sayi = 0;
		     
		     int length=name.length();
		     
		     for (int i=0; i <length-1; i++) {   
		    	 if(name.charAt(i) == harf) {
		    	 sayi++;
		 }
		   }System.out.println(sayi);
	 }
	 	
	}


