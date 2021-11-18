package day08;

import java.util.Scanner;

public class besBasamakliSonIkiIlkIkiTopla {
public static void main(String[] args) {
	/*
	 *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 
	 *  ve son iki basamagindaki rakamlari toplamini bulunuz.
	 *   Ex :
	 *   input  : 12345
	 *   output : 12
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("bes basamakli bir sayi giriniz: ");
	int sayi = scan.nextInt();
	
	int birler=sayi%10;
	sayi/=10;
	int onlar=sayi%10;
	sayi/=100;
	int binler = sayi%10;
	sayi/=10;
	
	System.out.println("girdiginiz sayinin ilk iki hanesindeki ve son iki hanesindeki sayilarin toplami: "+(birler+onlar+binler+sayi));
}
}
