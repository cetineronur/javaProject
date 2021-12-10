package day09;

import java.util.Scanner;

public class nastedIf {

	public static void main(String[] args) {
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir, 
        // calisan erkekse 65 yasindan buyukse emekli olabilir
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen cinsiyetini giriniz \nErkek icin E, \nKadin icin K giriniz ");
		char cinsiyet = scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen yasinizi giriniz");
		int yas= scan.nextInt();
	
		
		if (cinsiyet=='K' && yas>60) {
			System.out.println("emekli olabilirsin.");
		} else if (cinsiyet=='K' && yas<60) {
			System.out.println("emekli olamazsin");
		} else if (cinsiyet=='E' && yas>65) {
			System.out.println("emekli olabilirsin.");
		} else if (cinsiyet=='E' && yas<65) {
			System.out.println("emekli olamazsin.");
		} else {
			//System.out.println("yanlis karakter girdiniz.");
		}
	}
}
/* Diger cozum
if (cinsiyet=='E') {
	if (yas>65) {
		System.out.println("emekli olabilir.");
	}else {
		System.out.println("emekli olamaz");
	}
} else if (cinsiyet=='K') {
	if (yas>60) {
		System.out.println("emekli olabilirsin.");
	}else {
		System.out.println("emekli olamaz");
	}
}else {
	System.out.println("Lutfen gecerli bir harf secin.");
}
*/