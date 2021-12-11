package Tag11;

import java.util.Scanner;

public class stringManipulationEquals2 {

	public static void main(String[] args) {
		/*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		- Girilen kelime cumlede kullanilmamis.
		- Girilen kelime cumlede 1 kere kullanilmis.
		- Girilen kelime cumlede 1’den fazla kullanilmis.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("BIr cumle giriniz");
		String cumle=scan.nextLine();
		System.out.println("bir de kelime giriniz");
		String kelime =scan.next();
			
		int sayi=cumle.length();
		//System.out.println(cumle.indexOf('o',8));
		if (cumle.indexOf(kelime)==-1) {
			System.out.println("yazdiginiz kelime cumlede yok.");
		}else if (cumle.indexOf(kelime,sayi)>0) {
			System.out.println("yazdiginiz kelime cumlede bir kere kullanilmistir");
		}else {
			System.out.println("yazdiginiz kelime cumlede birden fazla kullanilmistir");
		}
		
	}

}
