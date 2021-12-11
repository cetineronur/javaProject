package Tag09;

import java.util.Scanner;

public class nestedIf2 {

	public static void main(String[] args) {
		/*Soru: Kullanıcıdan 4 basamakli bir sayi girmesini isteyin. Girdiği sayi 5’e
	bölünüyorsa son rakamını kontrol edin. Son rakamı 0 ise ekrana “5’e bölünen
	çift sayı” yazdırın. Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
	Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
*/	
		Scanner scan = new Scanner(System.in);
		System.out.println("Dort basamakli bir sayi girin");
		double sayi= scan.nextDouble();
	if (sayi<=999 || sayi>9999) {
		System.out.println("Lutfen dort basamakli sayi giriniz.");
	}else {
			if (sayi%5==0) {
			if (sayi%10==0) {
				System.out.println("5'e bolunebilen cift sayidir.");
			}else if (sayi%10!=0) {
				System.out.println("5'e bolunebilen tek sayidir.");
			}
		} else if (sayi%5!=0) {
			System.out.println("tekrar deneyin");
		}else {
			
		}
		scan.close();
		
		}
	}
}
