package Tag10;

import java.util.Scanner;

public class turnary4 {

	public static void main(String[] args) {
		//Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi girin");
		double sayi =scan.nextDouble();
		
		double mutlakdeger=sayi>=0?sayi:(-1)*sayi;
		System.out.println(mutlakdeger);
		System.out.println((sayi<0 || sayi==-0)? ("sayinin mutlak degeri: "+(sayi*-1)):(sayi==0)?"sayinin mutlak degeri: "+(sayi):"sayinin mutlak degeri"+sayi);
		if (sayi<0 && sayi!=0) {
			System.out.println("sayinin mutlak degeri: "+(sayi*-1));
		}else {
			System.out.println("sayinin mutlak degeri: "+sayi);
		}
	scan.close();
	}
}
