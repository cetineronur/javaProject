package Tag14;

import java.util.Scanner;

public class replaceAll1 {
	public static void main(String[] args) {
		/*Kullanicidan isim isteyin. Eger

		- isim “a” harfi iceriyorsa “Girdiginiz isim a harfi iceriyor”
		- isim “Z” harfi iceriyorsa “Girdiginiz isim Z harfi iceriyor”
		- ikisi de yoksa “Girdiginiz isim a veya Z harfi icermiyor” yazdirin
		*/
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String isim = scan.next();
		int index=isim.length();
		if (isim.contains("a")) {
			System.out.println("girdiginiz isim" +" a"+" harfi iceriyor");
		}else if (isim.contains("Z")) {
			System.out.println("girdiginiz isim" +" Z"+" harfi iceriyor");
			
		}else {
			System.out.println("Girdiginiz isim a veya Z harfi icermiyor");
		}
		
	}

}
