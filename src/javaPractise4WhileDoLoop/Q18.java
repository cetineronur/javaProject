package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {

        //STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
    	Scanner scan = new Scanner(System.in);
    	System.out.println("sifrenizi girinz: ");
    	String userPin = scan.nextLine();
    	
    	String systemPin="javacanlara selam olsun";
    	int count=1;
    	while(userPin!=systemPin) {
    		System.out.println("****** hatali giris yapildi ******");
    		count++;
    		System.out.println("kalan giris hakki: "+(4-count));
    		System.out.println("tekrar giris yapin");
    		userPin=scan.nextLine();
    		
    		if (userPin.equals(systemPin)) {
				System.out.println("gayet basarili");
				break;
			}else if (count>=3) {
				System.out.println("3 kere yanlis girdiniz.");
				break;
			}
       	}scan.close();
    }
}
