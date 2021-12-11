package Tag20;

import java.util.Scanner;

public class whileLoop1 {

	public static void main(String[] args) {
		/*Kullanicidan bir rakam alin ve bu rakam icin carpim tablosunu ekrana
		yazdirin. Kullanicinin hata yapmadigini farz edin.
		Ornegin kullanici 3 girerse;
		3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir rakam giriniz: ");
		int a = scan.nextInt();
		int sayi=1;
		while (sayi<11) {
			System.out.print(a+"x"+sayi+"="+(a*sayi)+"  ");
			sayi++;
		
		}
		scan.close();
	}

}
