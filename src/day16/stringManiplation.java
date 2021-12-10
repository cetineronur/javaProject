package day16;
import java.util.Scanner;
public class stringManiplation {
	public static void main(String[] args) {
		//Kullanicidan alacaginiz, 3 kelimeden olusan ismi
        // orn. Ahmet Emin Yilmaz -> A.E.Y.  formatiyla yazdiriniz.

		Scanner scan =new Scanner(System.in);
		System.out.println("3 kelimeden olusan bir isim giriniz: ");
		String name =scan.nextLine();
		
		System.out.println("isminizin kisa yazilisi: "+(name.substring(0, name.indexOf(" ")).toUpperCase().charAt(0))+"."+name.substring(name.indexOf(" ")+1).toUpperCase().charAt(0)+"."+name.substring(name.lastIndexOf(" ")+1).toUpperCase().charAt(0));
		scan.close();
		
	
	
		}
	
	}

