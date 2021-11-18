package day08;

import java.util.Scanner;

public class kareAlmaIslemi {
public static void main(String[] args) {
	/*  Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz nin karesi
    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.333333333333333
    */
	Scanner scan = new Scanner(System.in);
	System.out.println("1.sayiyi giriniz: ");
	double sayi1 = scan.nextDouble();
	System.out.println("2.sayiyi giriniz: ");
	double sayi2 = scan.nextDouble();
	System.out.println("3.sayiyi giriniz: ");
	double sayi3 = scan.nextDouble();
	
	System.out.println("sonuc: "+(Math.pow(sayi1,2)-Math.pow(sayi2,2))/(3*sayi3));
	scan.close();
	
}
}
