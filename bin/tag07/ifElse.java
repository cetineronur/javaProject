package day08;

import java.util.Scanner;

public class ifElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kenar uzunlugu girin");
		double sayi1=scan.nextDouble();
		System.out.println("bir kenar uzunlugu daha girin");
		double sayi2=scan.nextDouble();
		
		if (sayi1==sayi2) {
			System.out.println("karedir");
			
		} else {
			System.out.println("kare degildir.");
		}
		scan.close();
	}

}
