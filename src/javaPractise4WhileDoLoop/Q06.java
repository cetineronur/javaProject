package javaPractise4WhileDoLoop;

import java.util.Scanner;

public class Q06 {
	static int bolum=0;

	public static void main(String[] args) {
		// kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru 
		//kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz:\n bir sayi daha girip entera basin");
		int bolunen = scan.nextInt();
		int bolen = scan.nextInt();
		
		System.out.println("sonuc: "+bolme(bolunen,bolen));
		scan.close();
		}

	public static int bolme(int bolunen, int bolen) {
		while(bolunen>=bolen) {
		bolunen-=bolen;
		
		bolum++;
		}
		return bolum;
		
	}

}


