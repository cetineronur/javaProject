package Tag10;

import java.util.Scanner;

public class switchStatement4 {

	public static void main(String[] args) {
		/*Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin.

		Kullanici S girerse “Software”
		D girerse “Developer”
		E girerse “Engineer”
		T girerse “In Testing” yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("SDET harflerinden birini giriniz");
		char harf = scan.next().charAt(0);
		
		switch(harf) {
		case 'S':
			System.out.println("Software");
			break;
		case 'D':
			System.out.println("Devoloper");
			break;
		case 'E':
			System.out.println("Engineer");
			break;
		case 'T':
			System.out.println("In Testing");
			break;
			default:
				System.out.println("yanlis harf girdiniz.");
		
	}
		scan.close();
	}
}
