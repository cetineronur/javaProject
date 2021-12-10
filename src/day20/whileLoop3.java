package day20;

import java.util.Scanner;

public class whileLoop3 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve bu sayinin 
		//rakamlari toplamini yazdirin
		//iki yoldan cozum
		//1.yol
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen rakamlar toplamini bulmak icin bir sayi giriniz: ");
		int a = scan.nextInt();
		String b =String.valueOf(a);
		int length = b.length();
		int c=0;
		int toplam=0;
		while(length>c) {
			char sayi =b.charAt(c);
			String sayi3=String.valueOf(sayi);
			int sayi1=Integer.valueOf(sayi3);
			c++;
			toplam+=sayi1;
		}System.out.println(toplam);
		//2.yol
		toplam=0;
		while (a>0) {
			c=a%10;
			toplam+=c;
			a/=10;
		}
		System.out.println("girdiginiz sayinin akamlar toplami: "+toplam);
		scan.close();
	}

}
