package day20;

import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		/* Kullanicidan bir sifre girmesini isteyin. 
		 * Girilen sifreyi asagidaki sartlara gore kontrol
		edin ve sifredeki hatalari yazdirin.
		Kullanici gecerli bir sifre girinceye kadar bu 
		islemi tekrar edin ve gecerli sifre
		girdiginde “Sifreniz Kabul edilmistir” yazdirin.

		- Sifre kucuk harf icermelidir
		- Sifre buyuk harf icermelidir
		- Sifre ozel karakter icermelidir
		- Sifre en az 8 karakter olmalidir.*/
		
		Scanner scan = new Scanner(System.in);
		String sifre="";
		boolean khk=false;
		boolean bhk=false;
		boolean okk=false;
		boolean uk=false;
			
		do {
			System.out.println("Lurfen sifrenizi giriniz: ");
			sifre=scan.nextLine();
			
				khk=kucukharfkontrol(sifre,khk);
				bhk=buyukharfkontrol(sifre,bhk);
				okk=ozelkrakterkontrol(sifre,okk);
				uk=uzunlukkontrol(sifre,uk);	
			
		} while (!khk || !bhk || !okk || !uk);
		
		System.out.println("Sifreniz basari ile kayit edilmistir.");
		scan.close();
		
	}
	private static boolean uzunlukkontrol(String sifre, boolean uk) {
		if(sifre.length()>8) {
			uk=true;
		}
		if (!uk) {
			System.out.println("Sifreniz en az 8 krakter olmalidir.");
		}
		return uk;
	}

	private static boolean ozelkrakterkontrol(String sifre, boolean okk) {
		for (int i = 0; i <sifre.length(); i++) {
			if (sifre.charAt(i)<=47 && sifre.charAt(i)>=32) {
				okk=true;
				break;
			}
		}
		if (!okk) {
			System.out.println("Sifrenizde en az bir ozel krakter bulunmalidir.");
		}
		return okk;
		
	}

	private static boolean buyukharfkontrol(String sifre, boolean bhk) {
		for (int i = 0; i <sifre.length(); i++) {
			if (sifre.charAt(i)<=90 && sifre.charAt(i)>=65) {
				bhk=true;
				break;
			}
		}
		if (!bhk) {
			System.out.println("Sifrenizde en az bir buyuk krakter bulunmalidir.");
		}
		return bhk;
	}

	private static boolean kucukharfkontrol(String sifre, boolean khk) {
		
		for (int i = 0; i <sifre.length(); i++) {
			if (sifre.charAt(i)<=122 && sifre.charAt(i)>=97) {
				khk=true;
				break;
			}
		}
		if (!khk) {
			System.out.println("Sifrenizde en az bir kucuk krakter bulunmalidir.");
		}
		return khk;
	}

}
