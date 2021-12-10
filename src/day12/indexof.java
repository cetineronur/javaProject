package day12;

import java.util.Scanner;

public class indexof {

	public static void main(String[] args) {
		//Kullanicidan bir cumle ve bir harf isteyin, 
		//harfin cumlede var olup olmadigini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen bir cumle giriniz: ");
		
		String cumle = scan.nextLine();
		System.out.println("Lutfen valigini kontrol etmek icin bir harf giriniz");
		
		char krk = scan.next().charAt(0);
		int index=cumle.indexOf(krk);
		
		if (index<0) {
			System.out.println("girdiginiz harf verilen cumlede yok");
		}else {
			System.out.println("girdiginiz harf verilen cumlede var");
		}
		
	}

}
