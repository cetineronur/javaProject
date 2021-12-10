package javaPractise3;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*  Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */

    	Scanner scan = new Scanner(System.in);
		System.out.print("bir sayi giriniz : ");
		int sayi=scan.nextInt();
		int kare=0;
		int toplam=0;
		for (int i = 1; i <=sayi; i++) {
			kare=i*i;
			toplam+=kare;
		}System.out.println("1'den girilen sayiya kadar olan sayilarin kareleri toplami: "+toplam);
        scan.close();
    }
}
