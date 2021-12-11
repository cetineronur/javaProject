package Tag14;

import java.util.Scanner;

public class substring {
	public static void main(String[] args) {
		// Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("4 harfli bir kelime giriniz");
		String kelime = scan.next();
		System.out.print(kelime.substring(3, 4));
		System.out.print(kelime.substring(2, 3));
		System.out.print(kelime.substring(1, 2));
		System.out.print(kelime.substring(0, 1));
	}

}
