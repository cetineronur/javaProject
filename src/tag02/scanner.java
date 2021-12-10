package tag02;

import java.util.Scanner;
public class scanner {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("tam sayi giriniz");
		int tamSayi1=scan.nextInt();
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("tam sayi giriniz");
		int tamSayi2=scan1.nextInt();
		
		System.out.println("Toplam: "+(tamSayi1+tamSayi2));
	
	}
}
