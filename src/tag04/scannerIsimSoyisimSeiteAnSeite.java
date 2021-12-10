package tag04;
import java.util.Scanner;
public class scannerIsimSoyisimSeiteAnSeite {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Isim giriniz: ");
		String ad = scan.nextLine();
		
		System.out.println("soyad giriniz: ");
		String soyad = scan.nextLine();
		
		System.out.println("isim - Soyisim: "+ad+" "+soyad);
	
	}
}