package Tag08;

import java.util.Scanner;

public class haftaninGunleri1 {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("bir gun ismi giriniz: ");
	String gun =scan.nextLine().toUpperCase();
	
	if (gun.equals("PAZAR") || gun.equals("CUMARTESI")) {
		System.out.println("girilen gun: "+" haftasonudur.");
	}
	if (gun.equals("PAZARTESI") || gun.equals("SALI") 
	|| gun.equals("CARSAMBA")
	|| gun.equals("PERSEMBE")
	|| gun.equals("CUMA")) {
		System.out.println("girilen gun: "+"haftaicidir.");
	}
	 // String non-primitive oldugu icin == 
	//kullanilmaz bunun yerine equals() kullanilmalidir
}
}
