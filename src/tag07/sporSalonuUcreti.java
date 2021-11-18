package day08;
import java.util.Scanner;
public class sporSalonuUcreti {
public static void main(String[] args) {
	 /*
    TechProEd spor salonu için kullanıcıdan isim, 
    soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
    bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
     */
	Scanner scan = new Scanner(System.in);
	System.out.println("Adinizi ve soyadinizi giriniz: ");
	String adsoyad= scan.nextLine();
	System.out.println("Yasinizi giriniz: ");
	int yas= scan.nextInt();
	System.out.println("kilonuzu giriniz: ");
	int kilo= scan.nextInt();
	System.out.println("boyhunuzu giriniz: ");
	int boy= scan.nextInt();
	System.out.println("devam edeceginiz ay suresini giriniz: ");
	int sure= scan.nextInt();
	
	System.out.println("sayin: "+adsoyad.toUpperCase()
	+"\n"+"yasiniz: "+yas
	+"\n"+"kilonuz: "+kilo+"\n"+"boyunuz: "+boy
	+"\n"+"toplam ucret: "+(sure*20)+" dolar"
	+"\n"+" "+sure+" "+"ay"+" katilacaginiz icin.");

 	}
}
