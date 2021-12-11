package Tag07;

import java.util.Scanner;

public class vucutKitleIndex {
	public static void main(String[] args) {
		/*
        Kullanicidan kilosunu ve boyunu alip
        Vucut kitle indeksini hesaplayan bir program yaziniz.
        Ipucu : Vucut 
        Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
        ORNEK:
        INPUT   :     Kilo: 71
                      Boy: 1,72
        OUTPUT  : Vucut Kitle Indeksiniz : 23
         */
		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");
		int kilo = scan.nextInt();
		System.out.println("boyunuzu giriniz: ");
		int boy = scan.nextInt();
		
		double kitleendex=(kilo/Math.pow(boy,2));
		System.out.println("vucut kitle endexiniz: "+ kitleendex);
		
		

	}
}
