package tag02;
import java.util.Scanner;
public class IsimSoyisim {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("adinizi giriniz");
		String Ad= scan.nextLine();
		
		System.out.println("Soyadinizi giriniz");
		String Soyad= scan.nextLine();
		System.out.println("Isim - Soyisim: "+Ad+" "+ Soyad);

	}

}
