package day13;
import java.util.Scanner;
public class replaceall3 {

	public static void main(String[] args) {
		// Kullanicidan ismini, soyismini ve 
		//kredi karti bilgisini isteyin ve asagidaki gibi yazdirin

        //isim-soyisim : M***** B*******
		//kart no : **** **** **** 1234

		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isminizi giriniz");
		String isim = scan.next();
		
		System.out.println("lutfen soyadinizi giriniz");
		String soyisim = scan.next();
		
		System.out.println("lutfen 16 krakterli kk numarinizi bosluk birakmadan yaziniz");
		String kkNo = scan.next();
		
		String isimformatli = isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		
		String soyisimformatli = soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w", "*");	
		String kkFormatli = "**** **** **** "+kkNo.substring(12);		
		
		System.out.println("isim-soyisim : "+ isimformatli+ " "+soyisimformatli);
		System.out.println("Kart no: "+kkFormatli);
		
		scan.close();
	}

}
