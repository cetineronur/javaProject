package day09;

import java.util.Scanner;

public class ifElseIf5 {

	public static void main(String[] args) {
		/*Kullanicidan gun ismini yazmasini isteyin. 
		Girilen isim gecerli bir gun ise gun

		isminin 1.,2. ve 3.harflerini ilk harf buyuk 
		diger ikisi kucuk olarak yazdirin, gun ismi
		gecerli degilse “Gecerli gun ismi giriniz” yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir gun ismi giriniz: ");
		String gun = scan.nextLine().toLowerCase();
		
		if (gun.equals("cumartesi") ||gun.equals("pazar") || gun.equals("pazartesi") 
				|| gun.equals("sali") || gun.equals("carsamba") || gun.equals("persembe")
				|| gun.equals("cuma")) {
			//char ilkharf = gun.toUpperCase().charAt(0);
			System.out.println(gun.toUpperCase().charAt(0)+""+gun.toLowerCase().charAt(1)+gun.toLowerCase().charAt(2));
		} else {
			System.out.println("Lutfen gecerli bir gun ismi giriniz: ");
		}
		scan.close();
		
	}

}
