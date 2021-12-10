package day07;

import java.util.Scanner;

public class basitIfCumleleri {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen bir tam sayi giriniz");
		Double sayi=scan.nextDouble();
		
		if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift bir sayidir.");
		}
		if (sayi%2==1) {
			System.out.println("girdiginiz sayi tek bir sayidir.");
		}

	}
}