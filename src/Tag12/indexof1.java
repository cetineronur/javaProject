package Tag12;
import java.util.Scanner;
public class indexof1 {
	public static void main(String[] args) {
		/*Kullanicidan bir cumle ve bir kelime isteyin, kelimenin cumledeki
		kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
		- Girilen kelime cumlede kullanilmamis.
		- Girilen kelime cumlede 1 kere kullanilmis.
		- Girilen kelime cumlede 1’den fazla kullanilmis.
*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String cumle = scan.nextLine();
		System.out.println("Lutfen aranacak kelimeyi giriniz");
		String kelime = scan.next();
		
		int index = cumle.indexOf(kelime);
		
		if (index==-1) {
			System.out.println("girdiginiz kelime cumlede hic gecmiyor.");
		}else if (cumle.indexOf(kelime, index+1)==-1) {
			System.out.println("kelime cumlede bir kere geciyor");
		}else {
			System.out.println("kelime cumlede birden fazla kullanilmistir.");
		}
		
	scan.close();
	}

}
