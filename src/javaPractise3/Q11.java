package javaPractise3;

import java.util.Scanner;

public class Q11 {
    /*Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {
        
    	Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi giriniz : ");
		int sayi=scan.nextInt();
   
		
		int toplam=0;
		mukemmel(sayi,toplam);
		
		scan.close();	
    }

	private static void mukemmel(int sayi, int toplam) {
		int i=1;
		while (i<=sayi) {
			if (sayi%i==0) {
				toplam+=i;
				}
			i++;
		}if (toplam-sayi==sayi) {
			System.out.println("bu bir mukemmel sayidir.");
		}else {
			System.out.println("mukkemmel sayi degildir");
		}
		
	}


}
