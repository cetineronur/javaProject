package tag31;

import java.time.LocalDate;
import java.time.Month;

public class dateTime {

	public static void main(String[] args) {
		// bir string ve bir int variable olusturalim.
		//bir loop icerisinde bu variable lari 1000 kere degistirelim.
		//ve islem surelerini kiyaslayalim.

		LocalDate tarih =LocalDate.now();
		System.out.println(tarih);
		System.out.println(tarih.getDayOfYear());
		System.out.println(tarih.getYear());
		System.out.println(tarih.plusDays(20));
		System.out.println(tarih.plusWeeks(15));
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));
		
		System.out.println(tarih.minusYears(21).isLeapYear());
		
		LocalDate dogumTarihi =LocalDate.of(1998,Month.JANUARY, 12);
		
		
		int kup=0;
		int a=153;
		int c=a;
		while(a>=1) {
		int b=a%10;
		kup+=b*b*b;
		a=a/10;
		}System.out.println(kup);
		if(kup==c) {
			System.out.println("Sayi armstrongdur");
		}else {
			System.out.println("degildir");
		}
		
	}

}
