package Tag12;

import java.util.Scanner;

public class lastindex1 {

	public static void main(String[] args) {
		/*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin

		- Girilen kelime cumlede kullanilmamis.
		- Girilen kelime cumlede 1 kere kullanilmis.
		- Girilen kelime cumlede 1’den fazla kullanilmis.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir cumle giriniz");
		String cumle =scan.nextLine();
		
		System.out.println("cumlede kontrol icin bir kelime giriniz");
		String kelime = scan.next();
		
		int	ilkindex = cumle.indexOf(kelime);
		int sonindex = cumle.lastIndexOf(kelime);
		
		if (ilkindex==-1) {
			System.out.println("cumlenin icinde kullanilmamistir");
		}else if (ilkindex==sonindex) {
			System.out.println("cumleded bir kere kullanilmistir");
		}else {
			System.out.println("cumlede hic kullanilmamistir");
		}
		scan.close();
	}

}
