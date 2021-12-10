package day10;

import java.util.Scanner;

public class turnary5 {

	public static void main(String[] args) {
		//Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse
		//sayinin karesini yazdirin
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int sayi = scan.nextInt();
		
		System.out.println((sayi>0)?"sayi poziftir":(sayi<0)?"sayinin karesi: "+(Math.pow(sayi, 2)):"0 negatif veya pozitif degildir.");
		
		if (sayi>0) {
			System.out.println("sayi poziftir");
		}else if (sayi<0) {
			System.out.println("sayinin karesi: "+(Math.pow(sayi, 2)));
		}else {
			System.out.println("0 negatif veya pozitif bir sayi degildir");
		}
	
	scan.close();
	}
}
