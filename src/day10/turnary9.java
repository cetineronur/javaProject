package day10;

import java.util.Scanner;

public class turnary9 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”, yoksa “Uc
		//basamakli degil” yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir tamsayi giriniz");
		int sayi = scan.nextInt();
		
		System.out.println((sayi<1000&&sayi>99)||(sayi>-1000&&sayi<-99)?"uc basamakli bir sayi":"uc basamakli degil");
		
		if (sayi<1000&&sayi>99) {
			if (sayi>-1000&&sayi<-99) {
					System.out.println("uc basamakli bir sayi");
			}
		}else {
			System.out.println("uc basmakli degil");
		}
	
		scan.close();
	}
}
