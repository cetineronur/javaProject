package javaPractise2;

import java.util.Scanner;

public class Q07 {
	
	public static void main(String[] args) {
    /*
        reverseString isminde bir method oluşturun.
        Bu method bir String'i parametre olarak alsın.
        Ve bu method, girilen String'i tersten yazsın.
        Terste yazılmış halini yazdırınız.

        Örn: String = "Java'yı Seviyorum."
        Print: .muroyiveS ıy'avaJ
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("tersden yazdirmak icin bir cumle giriniz:");
		String cumle = scan.nextLine();
		String ters="";
		ters(cumle,ters);
		System.out.print(ters(cumle,ters));
		
		scan.close();
}

	private static String ters(String cumle, String ters) {
		// TODO Auto-generated method stub
		for (int i =cumle.length(); i>0; i--) {
			ters+=cumle.charAt(i-1);
		}
			
	return ters;	
	}

	
}