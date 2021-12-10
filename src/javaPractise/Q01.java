package javaPractise;
import java.util.Scanner;
public class Q01 {
	public static void main(String[] args) {
		/*
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */
		Scanner scan = new Scanner(System.in);
    	System.out.println("1.sayiyi giriniz");
    	double sayi1 = scan.nextDouble();
    	System.out.println("2.sayiyi giriniz");
    	double sayi2 = scan.nextDouble();
    	double toplama=sayi1+sayi2;
    	double cikarma=sayi1-sayi2;
    	double carpma=sayi1*sayi2;
    	double bolme=sayi1/sayi2;
    	System.out.println("Toplama:\n"+"Cikarma:\n"+"Carpma:\n"+"Bolme:\n");
    	String islem=scan.next().toUpperCase();
    	//if (islem=="TOPLAMA"||islem=="CIKARMA"||islem=="CARPMA"||islem=="BOLME") {
			
    	if (islem.equals("TOPLAM")) {
			System.out.println(toplama);
		}else if(islem.equals("CIKARMA")) {
			System.out.println(cikarma);
		}else if(islem.equals("CARPMA")) {
			System.out.println(carpma);
		}else if(islem.equals("BOLME")) {
			System.out.println(bolme);
		}else {
    		System.out.println("lutfen dogru secim yapiniz");
		}
    	scan.close();
	}
}
