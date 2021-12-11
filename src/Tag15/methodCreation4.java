package Tag15;
import java.util.Scanner;
public class methodCreation4 {
	public static void main(String[] args) {
		/* Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
		- @ isareti icermiyorsa gecersiz email yazdirin
		- @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
		- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihre Mailadresse ein: ");
		String email = scan.next();	
		email(email);
		scan.close();
	}

	private static void email(String email) {
  		if (!email.contains("@")) {
			System.out.println("ungültige E-Mail Adresse! Bitte geben Sie Ihre E-Mail-Adresse erneut ein");
		}else if (!email.contains("@gmail.com")) {
			System.out.println("Bitte geben Sie eine Gmail-Adresse ein");
		}else if(!email.endsWith("@gmail.com")) {
			System.out.println("Sie haben es falsch geschrieben, bitte überprüfen Ihre E-Mail-Adresse");
		}else {
			System.out.println("Ihre E-Mail-Adresse wurde gespeichert");
		}
		
		} 
	}
