package javaPractise1;
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
		/*
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Bitte geben Sie Ihre Email Adresse ein");
    	String name = scan.next();
    	
    	if (!name.contains("@")) {
			System.out.println("gecerli bir email adresi giriniz");
		}else if (!name.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresi giriniz");
		}else if(name.substring(name.indexOf("@")+1).equals(("gmail.com"))) {
			System.out.println("Email kaydedildi");
		}
    	scan.close();
    	
    }

}
