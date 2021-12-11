package Tag08;

import java.util.Scanner;

public class ifElse2 {

	public static void main(String[] args) {
		/*Soru 4) Kullanicidan bir ucgenin uc kenar uzunlugunu 
		alin eger uc kenar uzunlugu birbirine esit ise ekrana 
		“Eskenar ucgen” yazdirin. 
		Diger durumlarda ekrana “Eskenar degil” yazdirin.
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("1. kenar uzunlugu girin");
		double kenar1=scan.nextDouble();
		System.out.println("2. kenar uzunlugu girin");
		double kenar2=scan.nextDouble();
		System.out.println("3. kenar uzunlugu girin");
		double kenar3=scan.nextDouble();
		
		if (kenar1==kenar2 && kenar2==kenar3) {
			System.out.println("eskenar ucgendir.");
		} else {
			System.out.println("eskenar ucgen degildir.");
		}
		scan.close();
	}
}
