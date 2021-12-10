package day11;

import java.util.Scanner;

public class kacGunSonraGunNe {

	public static void main(String[] args) {
		/*
	     * (Haftanın günü) Kullanıcıdan bugüne karşılık gelen bir tam sayı (Pazar - 0,
	     * Pazartesi - 1, …, ve Cumartesi - 6 olacak şekilde) alan bir program yazınız.
	     * Aynı zamanda kullanıcıdan, “bugünden kaç gün sonra” için de bir tam sayı
	     * değeri alarak, ona karşılık gelen günü gösteriniz
	     */
		Scanner scan = new Scanner(System.in);
		System.out.println("bugune karsilik gelen bir tam sayi giriniz");
		int gunNo = scan.nextInt();
		
		switch (gunNo) {
		case 0:
			System.out.println("Pazar");
			break;
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
			default:
				System.out.println("sayiyi 0 ile 6 araliginda yaziniz.");
		}
		System.out.println("bugunden kac sonrasini ogrenmek istiyorsunuz? bir rakam giriniz");
		int kacGunSonra=scan.nextInt();
		gunNo=kacGunSonra+gunNo;
		gunNo=gunNo%7;
		
		switch (gunNo) {
		case 0:
			System.out.println("Pazar");
			break;
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sali");
			break;
		case 3:
			System.out.println("Carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		}

	}

}
