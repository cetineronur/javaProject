package Tag14;
public class methodCreation {
	public static void main(String[] args) {
		/*verilen iki sayinin toplamini ve carpimini yapip yazdiran
		 * iki ayri method olusturun.
		 *method olusturmak icin 3 adim takip edelim
		 * 1.adim mehod call yazalim.
		 * 2.adim methoda arguman yazacak miyiz karar vermeliyiz.
		 */ 
		int sayi1=4;
		int sayi2=5;
		carpma(sayi1,sayi2);
		toplama(sayi1,sayi2); // method call
		// 3.adim 1. ve 2. adimi yaptiktan sonra javadan yardim methodu olusturuyoruz.
		carpma(sayi1,sayi2);
	}

	public static void carpma(int sayi1, int sayi2) {
	System.out.println("sayilarin carpimi: "+sayi1*sayi2);
		
	}

	public static void toplama(int sayi1, int sayi2) {
		// 4.adim erisim duzenleyici ve return type'a karar vermeliyiz.
		// erisim duzenleyici axcess modifler : public yaptik.
		// return type : bizden sadece yazdirma istedigi icin void kalabilir.
		System.out.println("sayilarin toplami: " +(sayi1+sayi2));
	}

}
