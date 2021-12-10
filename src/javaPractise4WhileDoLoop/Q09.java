package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
//  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

    	Scanner scan = new Scanner(System.in);
    	System.out.println("sifrenizi girinz: ");
    	int userPin = scan.nextInt();
    	
    	int systemPin=1453;
    	int count=0;
    	while(userPin!=systemPin) {
    		System.out.println("****** hatali giris yapildi ******");
    		System.out.println("tekrar giris yapin");
    		userPin=scan.nextInt();
    		count++;
    	
    	}
    	System.out.println("gayet basarili....");
    }
}

