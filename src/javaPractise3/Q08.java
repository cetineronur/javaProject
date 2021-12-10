package javaPractise3;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        // Kullanicidan bir String isteyin. Kullanicinin girdigi
        // String’in palindrome olup olmadigini kontrol eden bir program yazin.

    	Scanner scan =new Scanner(System.in);
    	System.out.println("Bir text giriniz");
    	String text = scan.nextLine(); 
    	String lager=null;
    	
    	for (int i = text.length()-1; i>=0; i--) {
    		lager+=text.toLowerCase().charAt(i);
    		
		}if (lager==text) {
			System.out.println("girilen metin palindrome dir.");
		}else {
			System.out.println("girilen metin palindrome degildir.");
		}scan.close();
    }
}

