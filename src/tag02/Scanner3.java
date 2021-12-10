package tag02;

import java.util.Scanner;

public class Scanner3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi giriniz");
		String Ad = scan.nextLine();
		
		System.out.println("Soyadinizi giriniz");
		String Soyad = scan.nextLine();
		
		System.out.println("girilen isim : "+Ad+" "+Soyad);

	}

}
