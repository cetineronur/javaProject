package day07;

import java.util.Scanner;

public class vizeFinalOrtalama {
	public static void main(String[] args) {
		//Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
       // * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
        //*/
        Scanner scan = new Scanner(System.in);
		System.out.println("1.vize notunuzu giriniz: ");
		int vize1 = scan.nextInt();
		
		System.out.println("2.vize notunuzu giriniz: ");
		int vize2 = scan.nextInt();
		
		System.out.println("final notunuzu giriniz: ");
		int fnal = scan.nextInt();
		
		int vizeortalama = (vize1+vize2)/2;
		int gecmenotu    =vizeortalama*30/100+fnal*70/100;
		System.out.println("ortalamaniz: "+gecmenotu);
		
		if (gecmenotu>=70) {
			System.out.println("gectiniz, basarilar");
		}
		if (gecmenotu<70) {
			System.out.println("kaldiniz. tekrar calisiniz.");
		}
	}

}
