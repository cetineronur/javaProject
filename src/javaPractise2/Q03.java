package javaPractise2;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {


// Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.
    	Scanner scan =new Scanner(System.in);
    	System.out.println("cevrilecek birimi giriniz");
    	String birim = scan.next();
    	
    	System.out.println("cevrilecek birimin degerini giriniz");
    	double miktar = scan.nextDouble();
    	
    	cevirici(birim,miktar);
    	scan.close();
      
    }

	private static void cevirici(String birim, double miktar) {
	switch (birim) {
	case "saat":
	System.out.println("girilen saatin saniye degeri: "+miktar*60*60+" saniye");
		break;
	case "mil":
		System.out.println("girilen milin kilometre degeri: "+miktar*1.6+" km");	
		break;
	case "kg":
		System.out.println("girilen kg in gram degeri: "+miktar*1000+" gram");	
	break;
	default:
		System.out.println("yanlis giris yaptiniz");	
		break;
	}
		
	}
}

