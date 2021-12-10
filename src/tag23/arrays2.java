package tag23;

import java.util.Arrays;
import java.util.Scanner;

public class arrays2 {

	public static void main(String[] args) {
		//  Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz: ");
		String kelimeler = scan.nextLine();
		String[] kelimeler1=kelimeler.split(" ");
		System.out.println(Arrays.toString(kelimeler1));
		System.out.println("Cumledeki kelime sayisi: "+kelimeler1.length);
		
		

	}

}
