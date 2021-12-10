package day10;

import java.util.Scanner;

public class turnary7 {

	public static void main(String[] args) {
		//Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” , buyuk harfse
		//consola “Buyuk Harf” yoksa “girdiginiz karakter harf degil” yazdirin.
		Scanner onur = new Scanner(System.in);
		System.out.println("Bir harf girin");
		char harf = onur.next().charAt(0);
		
		System.out.println((harf>='a'&&harf<='z')?"kucuk harf":(harf>='A'&&harf<='Z')?"buyuk harf":"Harf degil");
		
		if (harf>='a'&&harf<='z') {
			System.out.println("  kucuk harf");
		}else if(harf>='A'&&harf<='Z') {
			System.out.println("  buyuk harf");
		}else {
			System.out.println("  harf degil");
		}
		
		onur.close();
	}

}
