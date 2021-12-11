package Tag15;
import java.util.Scanner;
public class methodCreation {
		public static void main(String[] args) {
		// kullanicidan isim ve soyisim isteyin. 
		// iki farkli method olusturun. methodlardan biri girilen kelimeleri 
		// ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin.
		// 2.method isim ve soyismin ilkharfleri buyuk harf, kalan harfler * olacak sekilde birlestirsin.
		//kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihini sorun
		//ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben Sie Ihren Name ein: ");
		String name = scan.next();
		System.out.println("Bitte geben Sie Ihren Nahname ein: ");
		String nahname = scan.next();
		
		System.out.println("isminiz acik olarak mi yazilsin yoksa gizli olarak mi? 1: oder 2: ");
		int wahl = scan.nextInt();
		
		String einheitlich =null;
		
		if (wahl==1) {
			einheitlich=offeneNahme(name,nahname);
		} else if (wahl==2) {
			einheitlich=versteckt(name,nahname);
		}else {
			System.out.println("Lutfen 1 yada 2 seciniz ");
		}
		
		System.out.println(einheitlich);
		scan.close();
	}

	public static String versteckt(String name, String nahname) {
		name=name.substring(0, 1).toUpperCase()+name.substring(1).replaceAll("\\w", "*");
		nahname=nahname.substring(0, 1).toUpperCase()+nahname.substring(1).replaceAll("\\w", "*");
		
		return name+" "+nahname;
	}

	public static String offeneNahme(String name, String nahname) {
		int length=name.length();
		name=name.substring(0, 1).toUpperCase()+name.substring(1,length).toLowerCase();
		nahname=nahname.substring(0, 1).toUpperCase()+nahname.substring(1).toLowerCase();
		
		return name+" "+nahname;
		
	}



}
