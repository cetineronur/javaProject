package Tag10;

import java.util.Scanner;

public class turnary {

	public static void main(String[] args) {
		/*
         * Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin, girilen
         * degerlere gore dikdorgenin kare olup olmadigini yazdirin.
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("dikdortgenin uzun kenarini girin: ");
		int ukenar = scan.nextInt();
		System.out.println("dikdortgenin kisa kenarini girin:");
		int kkenar =scan.nextInt();
		
		System.out.println((ukenar==kkenar) ? ("karedir") : ("dikdortgendir"));
		
		if (kkenar==ukenar) {
			System.out.println("Karedir");
		}else {
			System.out.println("dikdortgendir");
		}

	}

}
