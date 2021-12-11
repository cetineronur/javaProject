package Tag07;

import java.util.Scanner;

public class dikdortgen {

	public static void main(String[] args) {
		/* Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
        ve dikdortgenin kare olup olmadigini yazdirin */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir kenar uzunlugu giriniz: ");
		double kenar1 = scan.nextDouble();
		
		System.out.println("Bir kenar uzunlugu giriniz: ");
		double kenar2 = scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girdiginiz Dikdortgen karedir");
		}
		if (kenar1!=kenar2) {
			System.out.println("girdiginiz dikdortgen kare degildir.");
			
		}
	}

}
