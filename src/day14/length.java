package day14;

import java.util.Scanner;

public class length {

	public static void main(String[] args) {
		// Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz");
		String isim = scan.next();
		System.out.println("Lutfen bir soyisim giriniz");
		String soyisim = scan.next();
		
		int uzunluk1=isim.length();
		int uzunluk2=soyisim.length();
		
		if (uzunluk1>uzunluk2) {
			System.out.println("isim daha uzundur");
		}else {
			System.out.println("Soyisim daha uzundur");
		}
	}

}
