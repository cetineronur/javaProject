package day08;

import java.util.Scanner;

public class birlerOnlarYuzlerBasamagi {
	public static void main(String[] args) {
		/*
		 * Kullanicidan uc basamakli bir sayi alin 
		 * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
		 * Ornek : Inputs : 853 
		 * Output : Girdiginiz sayinin birler basamagi : 3
		 *          Girdiginiz sayinin onlar basamagi : 5 
		 *          Girdiginiz sayinin yuzler basamagi : 8
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("uc basamakli bir sayi giriniz: ");
		int sayi = scan.nextInt();
		
		int birbas=sayi%10;
		sayi/=10;
		int onbas=sayi%10;
		sayi/=10;
		System.out.println("girdiginiz sayinin birler basamagi: "+birbas+"\n"
		+"girdiginiz sayinin onlar basamagi: "+onbas+"\n"
		+"giridiginiz sayinin yuzler basamagi: "+sayi);
		
	}

}
