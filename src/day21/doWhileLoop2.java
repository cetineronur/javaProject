package day21;

import java.util.Scanner;

public class doWhileLoop2 {

	public static void main(String[] args) {
		/* Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		islemi bitirmek icin 0’a basmasini soyleyin.
		Kullanici 0’a bastiginda toplam kac pozitif sayi 
		girdigini ve girdigi pozitif sayilarin
		toplaminin kac oldugunu yazdirin.*/
		
		
		Scanner scan = new Scanner(System.in);
		int count=0;
		int toplam=0;
		int sayi=1;
		do {
			
			System.out.println("toplamak icin pozitif sayilar girin ve entera basin.\n cikmak icin 0'a basin.");
			sayi=scan.nextInt();
			toplam+=sayi;
			count++;
			if (sayi==0) {
			break;
		}
		} while (sayi>1);
		System.out.println("toplam "+(count-1)+" sayi girdiniz ve girdiginiz sayilarin toplami: "+toplam);
		scan.close();
	}

}
