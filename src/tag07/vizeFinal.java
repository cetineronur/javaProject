package day08;

import java.util.Scanner;

public class vizeFinal {
public static void main(String[] args) {
	/*
	 * Kullanicidan alacaginiz vize2 vize2 ve final notlarini 
	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
	 */
	Scanner scan = new Scanner(System.in);
	System.out.println("1.vize notunu giriniz: ");
	double vize1 = scan.nextDouble();
	
	System.out.println("2.vize notunu giriniz: ");
	double vize2 = scan.nextDouble();
	
	System.out.println("Final notunu giriniz: ");
	double fnal = scan.nextDouble();
	
	double genelort = ((vize1+vize2)/2)*30/100+fnal*70/100;
	System.out.println("genel ortalamaniz: "+genelort);
	
	if (genelort<50) {
		System.out.println("beslik sistem: "+"1");
	}
	if (genelort>=50) {
		System.out.println("beslik sistem: "+"2");
	}
	if (genelort>=50 && genelort<70) {
		System.out.println("beslik sistem: "+"3");
	}
	if (genelort>=70 && genelort<85) {
		System.out.println("beslik sistem: "+"4");
	}
	if (genelort>=85 && genelort<=100) {
		System.out.println("beslik sistem: "+"5");
	}
}
}
