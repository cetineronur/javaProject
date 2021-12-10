package tag29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qmanav {
	static List<String> urunListesi =new ArrayList<>();
	  
	static double toplamOdenecekTutar;
	static int kilo;
	static char harf;
	static int wahl;
	List<Double> urunFiyatlari =new ArrayList<>();

	
	
	System.out.println("Toplam odenecek tutar: "+toplamOdenecekTutar);	
	
	public qmanav(scan, urunFiyatlari,toplamOdenecekTutar) {
		
	}
	
	public qmanav() {
		urunFiyatlari.add(0.99);
		urunFiyatlari.add(1.69);
		urunFiyatlari.add(1.15);
		urunFiyatlari.add(0.75);
		urunFiyatlari.add(0.95);
		Scanner scan = new Scanner(System.in);
		System.out.println("1.Banana\n"+"2.Domates\n"+"3.Biber\n"+"4.Salatalik\n"+"5.Portakal");
		System.out.println();
		System.out.println("******----------*******");
		System.out.println("almak istediginiz urunler icin yanlarindaki rakamlari yaziniz ");
		System.out.println(urunFiyatlari1);	
		wahl=scan.nextInt();
		
		if (wahl==1) {
			banana(scan, urunFiyatlari1,toplamOdenecekTutar);
		}else if (wahl==2) {
			domates(scan, urunFiyatlari1,toplamOdenecekTutar);
		}else if(wahl==3) {
			biber(scan, urunFiyatlari1,toplamOdenecekTutar);
		}else if (wahl==4) {
			salatalik(scan, urunFiyatlari1,toplamOdenecekTutar);
		}else if(wahl==5) {
			portakal(scan, urunFiyatlari1,toplamOdenecekTutar);
		}else {
			System.out.println("yanlis bir tuslama yaptiniz");
			secim(scan, urunFiyatlari1);
			}
	}
		
	
}
