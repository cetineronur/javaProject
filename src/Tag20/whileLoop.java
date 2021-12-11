package Tag20;

import java.util.Scanner;

public class whileLoop {

	public static void main(String[] args) {
		/*Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip bitis
		harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin. Kullanicinin hata
		yapmadigini farz edin.*/
		Scanner scan= new Scanner(System.in);
		System.out.println("bir harf girin\nsonra entera basin");
		String buschtaben1 = scan.next();
		String buschtaben2= scan.next();
		char a =buschtaben1.charAt(0);
		char b =buschtaben2.charAt(0);
		
		while (a>b) {
			String harf1 =String.valueOf(a);
			String harf2 =String.valueOf(b);
			System.out.print(harf2.toUpperCase()+" ");
			b++;
			if (a==b) {
				System.out.print(harf1.toUpperCase()+" ");
			}
		}
		while (b>a) {
			String harf1 =String.valueOf(a);
			String harf2 =String.valueOf(b);
			System.out.print(harf1.toUpperCase()+" ");
			a++;
			if (a==b) {
				System.out.print(harf2.toUpperCase()+" ");
			}
		}
		
		scan.close();
	}

}
