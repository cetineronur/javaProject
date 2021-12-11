package Tag08;

import java.util.Scanner;

public class haftaninGunleri {
public static void main(String[] args) {
	 /*
     * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin 
     * ve o harfle baslayan gun isimlerini yazdirin 
        Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             
        ilkHarf=S output = “Sali”
     *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin
     */
	
	Scanner scan = new Scanner(System.in);
	System.out.println("gun isimlerinden birinin ilk harfini girin: ");
	char gun = scan.next().toUpperCase().charAt(0);
	
	if (gun=='C') {
		System.out.println("Carsamba, Cuma ve Cumartesi");
	}
	if (gun=='P') {
		System.out.println("Persembe, Pazar ve Pazartesi");
	}
	if (gun=='S') {
		System.out.println("Sali");
	}
	if (gun!='S' && gun!='C' && gun!='P') {
		System.out.println("GECERSIZ BIR GIRIS YAPTINIZ. "
				+ "LUTFEN GUN ISIMLERINDEN BIRININ BAS HARFINI GIRINIZ.");
	}
}
}
