package tag02;

import java.util.Scanner;

public class scanner1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Karenin bir kenarini giriniz");
		int karekenari=scan.nextInt();
		
		System.out.println("kare'nin Cevresi:"+ (4*karekenari));
		System.out.println("kare'nin Alani:"+ (karekenari*karekenari));
		
	}

}
