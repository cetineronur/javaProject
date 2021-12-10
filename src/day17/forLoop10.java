package day17;

import java.util.Scanner;

public class forLoop10 {

	public static void main(String[] args) {
		//Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
		//sayinin faktoryel’ini bulun.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("10'dan kucuk bir tam sayi giriniz");
		int nummer= scan.nextInt();
		System.out.print(nummer + "!=");
		int carp=1;
		for (int i=1; i<=nummer; i++) {
			
			carp*=i;
			System.out.print(i+"*");
			
		}System.out.print("= "+carp);
		scan.close();
	}

}
