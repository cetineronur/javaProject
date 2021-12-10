package javaPractise1;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        /* Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */
       
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Ihren Name ein");
    	String name = scan.nextLine();
    	System.out.println("Bitte geben Sie Ihren Nahname ein");
    	String nahName = scan.next();
    	System.out.println("Bitte geben Sie Ihren Kredit Karte Nummer ein");
    	String kkartnummer = scan.next();
    	
    	
    	if (kkartnummer.length()>=16) {
    		System.out.println("Adiniz-Soyadiniz: "+(name.toUpperCase().charAt(0)+name.substring(1).replaceAll("\\w", "*")+" "+nahName.toUpperCase().charAt(0)+nahName.substring(1).replaceAll("\\w", "*")));
			System.out.println("Kart Nummer: "+(kkartnummer.substring(0, kkartnummer.length()-4).replaceAll("\\d", "*")+kkartnummer.substring(kkartnummer.length()-4, kkartnummer.length())));
		}else {
			System.out.println("Bitte geben Sie 16 nummer ein: ");
		}
    	scan.close();
    }
}
