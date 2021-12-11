package Tag07;

import java.util.Scanner;

public class ifEquals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir gun ismi girin: ");
		String gun = scan.next().toLowerCase();
		
		if (gun.equals("pazar")|| gun.equals("cumartesi")) {
			System.out.println("haftasonudur.");
		}
		if (gun.equals("Pazartesi") || gun.equals("sali")|| gun.equals("carsamba") || gun.equals("Persembe")|| gun.equals("cuma")) {
			System.out.println("hafta icidir.");
		}
		scan.close();
	}
}
