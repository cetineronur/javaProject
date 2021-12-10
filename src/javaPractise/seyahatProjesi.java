package javaPractise;
import java.util.Scanner;
public class seyahatProjesi {
	public static void main(String[] args) {
		
		System.out.println("***************************");
		System.out.println("Seyahat Sirketimize hosgeldiniz....");
		String islemler = "1: Frankfurt'a gitmek istiyorum\n2: Koln'e gitmek istiyorum\n3: Darmstadt'a gitmek istiyorum\n4: Cikis";
		System.out.println(islemler);
		System.out.println("***************************");
		double kmBirimFiyat=5, bakiye=1000, toplamTutar;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("nereye gitmek istediginizi numara ile giriniz: ");
		int islem =scan.nextInt();
		
		switch (islem) {
				case 1: 
			System.out.println("kac kisi gideceksiniz?");
			int kisiSay= scan.nextInt();
			if (kisiSay>0) {
				System.out.println(kisiSay+" kisi icin HEsaplaniyor...");
				toplamTutar=kisiSay*kmBirimFiyat*50;
				System.out.println("Frankfurt'a gitmek icin odemeniz gereken tutar: "+toplamTutar+" Euro");
				System.out.println("Onceki Bakiyeniz: "+bakiye);
				System.out.println("Yeni bakiyeniz: "+(bakiye-toplamTutar)+" Euro");
				System.out.println("Bizi tercih ettiginiz icin tesekkurler....");
			}else{ 
				System.out.println("Lutfen dogru bir rakam yaziniz");
			}
			
				break;
				case 2: 
					System.out.println("kac kisi gideceksiniz?");
					kisiSay= scan.nextInt();
					if (kisiSay>0) {
						System.out.println(kisiSay+" kisi icin HEsaplaniyor...");
						toplamTutar=kisiSay*kmBirimFiyat*50;
						System.out.println("Koln'e gitmek icin odemeniz gereken tutar: "+toplamTutar+" Euro");
						System.out.println("Onceki Bakiyeniz: "+bakiye);
						System.out.println("Yeni bakiyeniz: "+(bakiye-toplamTutar)+" Euro");
						System.out.println("Bizi tercih ettiginiz icin tesekkurler....");
					}else{ 
						System.out.println("Lutfen dogru bir rakam yazdiriniz");
					}
						break;
				case 3:
					System.out.println("kac kisi gideceksiniz?");
					kisiSay= scan.nextInt();
					if (kisiSay>0) {
						System.out.println(kisiSay+" kisi icin HEsaplaniyor...");
						toplamTutar=kisiSay*kmBirimFiyat*50;
						System.out.println("Darmstadt'a gitmek icin odemeniz gereken tutar: "+toplamTutar+" Euro");
						System.out.println("Onceki Bakiyeniz: "+bakiye);
						System.out.println("Yeni bakiyeniz: "+(bakiye-toplamTutar)+" Euro");
						System.out.println("Bizi tercih ettiginiz icin tesekkurler....");
					}else{ 
						System.out.println("Lutfen dogru bir rakam yazdiriniz");
					}
						break;
				case 4: 
					System.out.println("cikis yapiliyor....");
					break;
					default:
						System.out.println("lutfen dogru bir rakam seciniz");						
		}
			scan.close();
	}
}
