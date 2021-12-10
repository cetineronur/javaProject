package tag02;
import java.util.Scanner;
public class isimGir {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Adinizi Giriniz");
		String Ad = scan.nextLine();
		
		System.out.println("soyadinizi Giriniz");
		String Soyad = scan.nextLine();
		
		System.out.println("Adiniz: "+Ad);
		System.out.println("Soyadiniz: "+Soyad);
		System.out.println("Kursumuza katiliminiz alinmistir, tesekkur ederiz.");
		
	}

}
