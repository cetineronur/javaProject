package Tag10;

import java.util.Scanner;

public class switchStatement2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("bir harf notu giriniz: ");
		char not=scan.next().charAt(0);
		
		switch(not) {
		case 'A':
			System.out.println("85-100 arasi");
			break;
		case 'B':
			System.out.println("60-85 arasi");
			break;
		case 'C':
			System.out.println("50-60 arasi");
			break;
		case 'D':
			System.out.println("80-50 arasi");
			break;
			default:
				System.out.println("gecersiz rakam");
		}
	}
}
