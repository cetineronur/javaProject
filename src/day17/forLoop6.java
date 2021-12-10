package day17;

import java.util.Scanner;

public class forLoop6 {

	public static void main(String[] args) {
		//Kullanicidan bir String isteyin ve Stringi tersten yazdirin.

		
		Scanner scan = new Scanner(System.in);
		System.out.println("100'den kucuk bir tam sayi giriniz");
		String text= scan.nextLine();
		int length=text.length();
		
		for (int i = length-1; i>=0 ; i--) {
			System.out.print(text.substring(i, i+1));
		}
		scan.close();
	}

}
