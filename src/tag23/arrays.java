package tag23;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String cumle = scan.nextLine();
		
		String [] kelimeler = cumle.split(" ");
		System.out.println(kelimeler.length+ " kelimeden olusmaktadir.");
		String [] krakterler = cumle.split("");
		System.out.println(krakterler.length+" krakterden olusmaktadir.");
		String [] cumle1 = cumle.split("\\.");
		System.out.println(cumle1.length+" Cumleden olusmaktadir.");
		
	}

}
