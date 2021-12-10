package tag31;

import java.time.LocalTime;
import java.time.ZoneId;

public class localTime {

	public static void main(String[] args) {
		LocalTime saat = LocalTime.now();
		System.out.println("baslangic saati "+saat);
		
		int sayi=10;
		for (int i = 0; i <10000; i++) {
			sayi++;
		}
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati     "+saatBitis);
		
		// Eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak 
		//hem basinda, hem de sonunda LocalTime objesi olusturmaliyiz.
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("For Loop "+(nanobitis-nano1)+" nano saniyede tamamlandi");
		
		
		
		String str="celil";
		for (int i = 0; i <10000; i++) {
			str+=" ";
		}
		LocalTime saatBitisS=LocalTime.now();
		System.out.println("bitis saati     "+saatBitisS);
		
		double nanobitisS=saatBitisS.getNano();
		
		LocalTime yerelSaat = LocalTime.now(ZoneId.of("Turkey"));
		
		System.out.println(yerelSaat);
	}

}
